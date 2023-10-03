package main;

import util.InputUtil;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        while (true) {
            MenuUtil.selectoperation(InputUtil.requireNumber("Zehmet olmasa emeliyyati secin: "
                    + "\n1. Telebe qeydiyyati"
                    + "\n2. Butun telebeleri goster"
                    + "\n3. Axtaris"
                    + "\n4. Melumatlari yenile \n"));
        }
    }
}
