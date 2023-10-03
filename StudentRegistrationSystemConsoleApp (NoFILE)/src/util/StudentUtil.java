package util;

import beans.Student;
import main.Config;

import static util.InputUtil.*;

public class StudentUtil {
    public static void registeredStudents() {
        int count = requireNumber("Nece telebe qeydiyyatdan kecireceksiz? ");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            Config.students[i] = registeredStudent();
        }
        System.out.println("Qeydiyyat ugurla tamamlandi!");
    }

    public static Student registeredStudent() {
        return new Student(requireName(), requireSurname(), requireAge(), requireclassName());
    }

    public static void printAllStudent() {
        for (int i = 0; i < Config.students.length; i++) {
            System.out.println(i + 1 + ". " + Config.students[i].getFullInfo());
        }
    }

    public static void searchStudents() {
        String search = requireText("ad, soyad veya sinif daxil edin: ");
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students[i].getName().contains(search) ||
                    Config.students[i].getSurname().contains(search) ||
                    Config.students[i].getClassName().contains(search)) count++;
        }
        Student[] st = new Student[count];
        int index = 0;
        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students[i].getName().contains(search) ||
                    Config.students[i].getSurname().contains(search) ||
                    Config.students[i].getClassName().contains(search))
                st[index++] = Config.students[i];
        }

        if (st.length != 0) {
            System.out.println("Tapilanlar");
            for (int i = 0; i < st.length; i++) {
                System.out.println(st[i].getFullInfo());
            }
        } else System.out.println("Tapilmadi!");
    }

    public static void changeInfoStudent() {
        System.out.println("Butun telebeler:");
        printAllStudent();
        int index = requireNumber("zehmet olmasa deyismek istediyiniz telebenin index`ini daxil edin: ") - 1;
        String[] split = requireText("Neleri deyismek isterdiz? mes,   name,surname,age,classname").split(",");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase("name")) Config.students[index].setName(requireName());
            else if (split[i].equalsIgnoreCase("surname")) Config.students[index].setSurname(requireSurname());
            else if (split[i].equalsIgnoreCase("age")) Config.students[index].setAge(requireAge());
            else if (split[i].equalsIgnoreCase("classname")) Config.students[index].setClassName(requireclassName());


        }

    }

}
