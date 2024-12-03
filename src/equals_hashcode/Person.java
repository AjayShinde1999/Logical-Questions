package equals_hashcode;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

//    @Override
//    public int hashCode() {
//        return 31 * name.hashCode() + age;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person(25, "Ajay");
        Person p2 = new Person(25, "Ajay");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}
