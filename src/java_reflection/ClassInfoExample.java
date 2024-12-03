package java_reflection;

import java.lang.reflect.*;

public class ClassInfoExample {
    public static void main(String[] args) {
        try {
            // Getting the Class object
            Class<?> cls = Class.forName("java.util.ArrayList");

            // Getting class name
            System.out.println("Class Name: " + cls.getName());

            // Getting superclass
            System.out.println("Superclass: " + cls.getSuperclass().getName());

            // Getting all declared methods
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println(" - " + method.getName());
            }

            // Getting all declared fields
            Field[] fields = cls.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println(" - " + field.getName());
            }

            // Getting all constructors
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" - " + constructor.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
