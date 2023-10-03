package util;

public class MenuUtil {
    public static void selectoperation(int operation) {
        switch (operation) {
            case 1:
                StudentUtil.registeredStudents();
                break;
            case 2:
                StudentUtil.printAllStudent();
                break;
            case 3:
                StudentUtil.searchStudents();
                break;
            case 4:
                StudentUtil.changeInfoStudent();
                break;
            default:
                System.out.println("Zehmet olmasa emeliyyat duzgun daxil edin");
        }

    }
}
