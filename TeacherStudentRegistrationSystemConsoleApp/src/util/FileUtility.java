package util;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtility {
    public static void writeObject(Object o, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(o);
        } catch (Exception e) {
            new Exception("Fayla yazıla bilmədi!");
        }
    }

    public static Object readObject(String fileName) {
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            obj = ois.readObject();
        }finally {
            return obj;
        }
    }
}
