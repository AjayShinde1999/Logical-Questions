package java_programs;

public final class Immutable {

    private final int age;
    private final String name;

    private Immutable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Immutable immutable = new Immutable(25, "Ajay");
        System.out.println(immutable.getAge());
        System.out.println(immutable.getName());
    }
}
