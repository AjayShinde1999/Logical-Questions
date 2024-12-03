package PrototypeDesignPattern;

class Student implements Cloneable {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Example {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("Ajay", 25);
        Student clonedObj = (Student) student.clone();
//        clonedObj.setAge(27);

        System.out.println(student==clonedObj); // false

        System.out.println(student.getName().equals(clonedObj.getName())); // true
        System.out.println(student.getAge() == clonedObj.getAge()); // true

    }
}
