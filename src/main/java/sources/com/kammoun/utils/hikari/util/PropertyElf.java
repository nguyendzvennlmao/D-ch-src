package com.kammoun.utils.hikari.util;

import com.kammoun.utils.hikari.HikariConfig;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PropertyElf {
    private static final Pattern GETTER_PATTERN = Pattern.compile("(get|is)[A-Z].+");

    private PropertyElf() {
    }

    public static void setTargetFromProperties(Object obj, Properties properties) {
        if (obj == null || properties == null) {
            return;
        }
        List asList = Arrays.asList(obj.getClass().getMethods());
        properties.forEach((obj2, obj3) -> {
            if ((obj instanceof HikariConfig) && obj2.toString().startsWith("dataSource.")) {
                ((HikariConfig) obj).addDataSourceProperty(obj2.toString().substring("dataSource.".length()), obj3);
            } else {
                setProperty(obj, obj2.toString(), obj3, asList);
            }
        });
    }

    public static Set<String> getPropertyNames(Class<?> cls) {
        HashSet hashSet = new HashSet();
        Matcher matcher = GETTER_PATTERN.matcher(JsonProperty.USE_DEFAULT_NAME);
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            if (method.getParameterTypes().length == 0 && matcher.reset(name).matches()) {
                String replaceFirst = name.replaceFirst("(get|is)", JsonProperty.USE_DEFAULT_NAME);
                try {
                    if (cls.getMethod("set" + replaceFirst, method.getReturnType()) != null) {
                        hashSet.add(Character.toLowerCase(replaceFirst.charAt(0)) + replaceFirst.substring(1));
                    }
                } catch (Exception e) {
                }
            }
        }
        return hashSet;
    }

    public static Object getProperty(String str, Object obj) {
        try {
            return obj.getClass().getMethod("get" + str.substring(0, 1).toUpperCase(Locale.ENGLISH) + str.substring(1), new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e) {
            try {
                return obj.getClass().getMethod("is" + str.substring(0, 1).toUpperCase(Locale.ENGLISH) + str.substring(1), new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception e2) {
                return null;
            }
        }
    }

    public static Properties copyProperties(Properties properties) {
        Properties properties2 = new Properties();
        properties.forEach((obj, obj2) -> {
            properties2.setProperty(obj.toString(), obj2.toString());
        });
        return properties2;
    }

    private static void setProperty(Object obj, String str, Object obj2, List<Method> list) {
        Logger logger = LoggerFactory.getLogger((Class<?>) PropertyElf.class);
        String str2 = "set" + str.substring(0, 1).toUpperCase(Locale.ENGLISH) + str.substring(1);
        Method orElse = list.stream().filter(method -> {
            return method.getName().equals(str2) && method.getParameterCount() == 1;
        }).findFirst().orElse(null);
        if (orElse == null) {
            String str3 = "set" + str.toUpperCase(Locale.ENGLISH);
            orElse = list.stream().filter(method2 -> {
                return method2.getName().equals(str3) && method2.getParameterCount() == 1;
            }).findFirst().orElse(null);
        }
        if (orElse == null) {
            logger.error("Property {} does not exist on target {}", str, obj.getClass());
            throw new RuntimeException(String.format("Property %s does not exist on target %s", str, obj.getClass()));
        }
        try {
            Class<?> cls = orElse.getParameterTypes()[0];
            if (cls == Integer.TYPE) {
                orElse.invoke(obj, Integer.valueOf(Integer.parseInt(obj2.toString())));
            } else if (cls == Long.TYPE) {
                orElse.invoke(obj, Long.valueOf(Long.parseLong(obj2.toString())));
            } else if (cls == Short.TYPE) {
                orElse.invoke(obj, Short.valueOf(Short.parseShort(obj2.toString())));
            } else if (cls == Boolean.TYPE || cls == Boolean.class) {
                orElse.invoke(obj, Boolean.valueOf(Boolean.parseBoolean(obj2.toString())));
            } else if (cls == String.class) {
                orElse.invoke(obj, obj2.toString());
            } else {
                try {
                    logger.debug("Try to create a new instance of \"{}\"", obj2);
                    orElse.invoke(obj, Class.forName(obj2.toString()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException | InstantiationException e) {
                    logger.debug("Class \"{}\" not found or could not instantiate it (Default constructor)", obj2);
                    orElse.invoke(obj, obj2);
                }
            }
        } catch (Exception e2) {
            logger.error("Failed to set property {} on target {}", str, obj.getClass(), e2);
            throw new RuntimeException(e2);
        }
    }
}
