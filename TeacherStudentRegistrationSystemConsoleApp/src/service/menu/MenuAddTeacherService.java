package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Surname: ");
        String surname = sc.nextLine();
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");
    }
}
