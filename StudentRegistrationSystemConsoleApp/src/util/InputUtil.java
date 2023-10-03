package util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextLine();
    }

    public static int requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextInt();
    }

    public static String requireName() {
        return requireText("Ad: ");
    }

    public static String requireSurname() {
        return requireText("Soyad: ");
    }

    public static int requireAge() {
        return requireNumber("Yas: ");
    }

    public static String requireclassName() {
        return requireText("Sinif: ");
    }
}
