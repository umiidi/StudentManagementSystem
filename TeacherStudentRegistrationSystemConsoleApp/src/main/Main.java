package main;

import bean.Config;

import static util.MenuUtil.*;

public class Main {
    public static void main(String[] args) {
        Config.initalize();
        showMenu();
    }
}
