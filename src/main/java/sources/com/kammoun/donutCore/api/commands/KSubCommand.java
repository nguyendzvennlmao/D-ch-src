package com.kammoun.donutCore.api.commands;

import java.util.List;
import org.bukkit.command.CommandSender;

public interface KSubCommand {
    String getName();

    String getPermission(int i);

    void perform(CommandSender commandSender, String[] strArr, int i);

    List getSubCommandTab(CommandSender commandSender, String[] strArr, int i);
}
