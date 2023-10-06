package util;

import bean.Config;
import service.menu.*;
import service.inter.Process;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()), REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()), ADD_TEACHER(4, "Add teacher", new MenuAddTeacherService()),
    SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowTeacherService()), SHOW_ALL_STUDENT(6, "Show all students", new MenuShowStudentService()),
    UNKNOWN;
    private String label;
    private Process service;
    private int number;

    Menu() {
    }

    Menu(int number, String label, Process service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel() {
        return this.label;
    }

    public void process() {
        this.service.process();
    }

    @Override
    public String toString() {
        return this.number + ". " + this.label;
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (number == menus[i].getNumber()) {
                return menus[i];
            }
        }
        return UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        if (!Config.isLoggedIn()) {
            System.out.println(menus[0] + "\n" + menus[1]);
        } else {
            for (int i = 2; i < menus.length; i++) {
                if (menus[i] != UNKNOWN) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}
