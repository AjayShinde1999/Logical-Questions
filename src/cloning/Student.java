package cloning;

public class Student implements Cloneable {

    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student student = new Student(24, "Ajay");
            System.out.println(student.age + " : " + student.name);

            Student cloned = (Student) student.clone();
            System.out.println(cloned.age + " : " + cloned.name);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
