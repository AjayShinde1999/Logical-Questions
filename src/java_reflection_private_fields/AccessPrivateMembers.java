package java_reflection_private_fields;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ExampleClass {
    private String secret = "Secret Value";

    private void displaySecret() {
        System.out.println("Secret: " + secret);
    }
}

public class AccessPrivateMembers {
    public static void main(String[] args) {
        try {
            ExampleClass example = new ExampleClass();

            // Accessing the private field
            Field field = ExampleClass.class.getDeclaredField("secret");
            field.setAccessible(true); // Bypass access control
            String value = (String) field.get(example);
            System.out.println("Private Field Value: " + value);

            // Invoking the private method
            Method method = ExampleClass.class.getDeclaredMethod("displaySecret");
            method.setAccessible(true); // Bypass access control
            method.invoke(example); // Call the method
        } catch (NoSuchFieldException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

