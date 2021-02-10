package com.skw359.diamond;

import org.bukkit.plugin.java.JavaPlugin;

public final class Diamond extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("\033[36;1mDIAMOND >> \033[32;1;2mAuthenticating Java environment (build 1.8.0+) \033[0m");
        System.out.println("\033[36;1mDIAMOND >> \033[32;1;2mLoading configuration...\033[0m");
        System.out.println("\033[36;1mDIAMOND >> \033[32;1;2mWelcome to Diamond, \033[34;1;2mby Sky_Wizard360\033[0m");

        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("\033[36;1mDIAMOND >> \033[32;1;2mDisabling...\033[0m");
    }
}