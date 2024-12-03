package copy_constructor;

class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name; // Copying the name
        this.age = other.age;   // Copying the age
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display the person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        // Creating an object of Person using parameterized constructor
        Person person1 = new Person("Alice", 30);

        // Creating a copy of person1 using the copy constructor
        Person person2 = new Person(person1);

        // Displaying the details of both persons
        System.out.println("Person 1:");
        person1.display();

        System.out.println("Person 2 (Copy of Person 1):");
        person2.display();
    }
}

