package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Surname: ");
        String surname = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        Config.instance().appendStudent(s);
        System.out.println("Student added");
    }
}
