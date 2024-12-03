package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(25, "Ajay"));
        list.add(new Student(23, "Rohan"));
        list.add(new Student(28, "Mohan"));
        list.add(new Student(20, "Abhi"));

        Collections.sort(list, new NameComparator());
        Collections.sort(list, new AgeComparator());

        for (Student s : list) {
            System.out.println(s.getAge() + " : " + s.getName());
        }

        // Using lambdas
//        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        // approach 2
//        list.sort(Comparator.comparing(Student::getName));

//        list.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

//        list.sort(Comparator.comparingInt(Student::getAge));

    }
}
