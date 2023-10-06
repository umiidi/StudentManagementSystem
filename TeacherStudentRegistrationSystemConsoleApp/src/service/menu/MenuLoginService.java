package service.menu;

import bean.Config;
import service.inter.menu.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        String surname = sc.nextLine();
        String password = sc.nextLine();
        if (!(surname.equals("parol") && password.equals("parol"))) {
            throw new IllegalArgumentException("Login failed!");
        }
        Config.setLoggedIn(true);
    }
}
