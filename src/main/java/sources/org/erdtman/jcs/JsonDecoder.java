package org.erdtman.jcs;

import com.kammoun.utils.jackson.core.JsonPointer;
import com.kammoun.utils.jackson.core.io.doubleparser.FastDoubleMath;
import com.kammoun.utils.jackson.core.util.RecyclerPool;
import com.kammoun.utils.jackson.databind.deser.DataFormatReaders;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Pattern;

class JsonDecoder {
    static final char LEFT_CURLY_BRACKET = '{';
    static final char RIGHT_CURLY_BRACKET = '}';
    static final char DOUBLE_QUOTE = '\"';
    static final char COLON_CHARACTER = ':';
    static final char LEFT_BRACKET = '[';
    static final char RIGHT_BRACKET = ']';
    static final char COMMA_CHARACTER = ',';
    static final char BACK_SLASH = '\\';
    static final Pattern BOOLEAN_PATTERN = Pattern.compile("true|false");
    static final Pattern NUMBER_PATTERN = Pattern.compile("-?[0-9]+(\\.[0-9]+)?([eE][-+]?[0-9]+)?");
    int index;
    int maxLength;
    String jsonData;
    Object root;

    public JsonDecoder(String str) throws IOException {
        this.jsonData = str;
        this.maxLength = this.jsonData.length();
        if (testNextNonWhiteSpaceChar() == LEFT_BRACKET) {
            scan();
            this.root = parseArray();
        } else {
            scanFor('{');
            this.root = parseObject();
        }
        while (this.index < this.maxLength) {
            String str2 = this.jsonData;
            int i = this.index;
            this.index = i + 1;
            if (!isWhiteSpace(str2.charAt(i))) {
                throw new IOException("Improperly terminated JSON object");
            }
        }
    }

    Object parseElement() throws IOException {
        switch (scan()) {
            case '\"':
                return parseQuotedString();
            case LEFT_BRACKET:
                return parseArray();
            case LEFT_CURLY_BRACKET:
                return parseObject();
            default:
                return parseSimpleType();
        }
    }

    Object parseObject() throws IOException {
        TreeMap treeMap = new TreeMap();
        boolean z = false;
        while (testNextNonWhiteSpaceChar() != RIGHT_CURLY_BRACKET) {
            if (z) {
                scanFor(',');
            }
            z = true;
            scanFor('\"');
            String parseQuotedString = parseQuotedString();
            scanFor(':');
            if (treeMap.put(parseQuotedString, parseElement()) != null) {
                throw new IOException("Duplicate property: " + parseQuotedString);
            }
        }
        scan();
        return treeMap;
    }

    Object parseArray() throws IOException {
        Vector vector = new Vector();
        boolean z = false;
        while (testNextNonWhiteSpaceChar() != RIGHT_BRACKET) {
            if (z) {
                scanFor(',');
            } else {
                z = true;
            }
            vector.add(parseElement());
        }
        scan();
        return vector;
    }

    Object parseSimpleType() throws IOException {
        this.index--;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char testNextNonWhiteSpaceChar = testNextNonWhiteSpaceChar();
            if (testNextNonWhiteSpaceChar == COMMA_CHARACTER || testNextNonWhiteSpaceChar == RIGHT_BRACKET || testNextNonWhiteSpaceChar == RIGHT_CURLY_BRACKET) {
                break;
            }
            char nextChar = nextChar();
            if (isWhiteSpace(nextChar)) {
                break;
            }
            sb.append(nextChar);
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            throw new IOException("Missing argument");
        }
        if (NUMBER_PATTERN.matcher(sb2).matches()) {
            return Double.valueOf(sb2);
        }
        if (BOOLEAN_PATTERN.matcher(sb2).matches()) {
            return new Boolean(sb2);
        }
        if (sb2.equals("null")) {
            return null;
        }
        throw new IOException("Unrecognized or malformed JSON token: " + sb2);
    }

    String parseQuotedString() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char nextChar = nextChar();
            if (nextChar < ' ') {
                throw new IOException(nextChar == '\n' ? "Unterminated string literal" : "Unescaped control character: 0x" + Integer.toString(nextChar, 16));
            }
            if (nextChar == '\"') {
                return sb.toString();
            }
            if (nextChar == BACK_SLASH) {
                char nextChar2 = nextChar();
                nextChar = nextChar2;
                switch (nextChar2) {
                    case '\"':
                    case JsonPointer.SEPARATOR:
                    case BACK_SLASH:
                        break;
                    case 'b':
                        nextChar = '\b';
                        break;
                    case 'f':
                        nextChar = '\f';
                        break;
                    case 'n':
                        nextChar = '\n';
                        break;
                    case 'r':
                        nextChar = '\r';
                        break;
                    case 't':
                        nextChar = '\t';
                        break;
                    case 'u':
                        nextChar = 0;
                        for (int i = 0; i < 4; i++) {
                            nextChar = (char) ((nextChar << 4) + getHexChar());
                        }
                        break;
                    default:
                        throw new IOException("Unsupported escape:" + nextChar);
                }
            }
            sb.append(nextChar);
        }
    }

    char getHexChar() throws IOException {
        char nextChar = nextChar();
        switch (nextChar) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case '6':
            case '7':
            case '8':
            case '9':
                return (char) (nextChar - '0');
            case COLON_CHARACTER:
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case DataFormatReaders.DEFAULT_MAX_INPUT_LOOKAHEAD:
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case LEFT_BRACKET:
            case BACK_SLASH:
            case RIGHT_BRACKET:
            case '^':
            case '_':
            case '`':
            default:
                throw new IOException("Bad hex in \\u escape: " + nextChar);
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return (char) ((nextChar - 'A') + 10);
            case 'a':
            case 'b':
            case 'c':
            case RecyclerPool.BoundedPoolBase.DEFAULT_CAPACITY:
            case 'e':
            case 'f':
                return (char) ((nextChar - 'a') + 10);
        }
    }

    char testNextNonWhiteSpaceChar() throws IOException {
        int i = this.index;
        char scan = scan();
        this.index = i;
        return scan;
    }

    void scanFor(char c) throws IOException {
        char scan = scan();
        if (scan != c) {
            throw new IOException("Expected '" + c + "' but got '" + scan + "'");
        }
    }

    char nextChar() throws IOException {
        if (this.index >= this.maxLength) {
            throw new IOException("Unexpected EOF reached");
        }
        String str = this.jsonData;
        int i = this.index;
        this.index = i + 1;
        return str.charAt(i);
    }

    boolean isWhiteSpace(char c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }

    char scan() throws IOException {
        char nextChar;
        do {
            nextChar = nextChar();
        } while (isWhiteSpace(nextChar));
        return nextChar;
    }
}
