package com.fg;

import com.fg.menu.services.IMenu;
import com.fg.menu.services.MenuService;

public class Application {

    public static void main(String[] args) {
        IMenu menuBuilder = new MenuService();
        menuBuilder.buildMenu();
    }

    public static void exitApplication() {
        System.out.println("Bye bye!!");
        System.exit(0);
    }
}
