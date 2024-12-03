package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {

    private int age;
    private String name;

    private Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.age, that.age);
    }

//    @Override
//    public int compareTo(Student that){
//        return this.name.compareTo(that.name);
//    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(25, "Ajay"));
        list.add(new Student(21, "Rohan"));
        list.add(new Student(20, "Abhi"));
        list.add(new Student(28, "Mohan"));

        Collections.sort(list);
//        Collections.sort(list,Collections.reverseOrder()); // descending order

        for (Student s : list) {
            System.out.println(s.age);
            System.out.println(s.name);
        }
    }
}
