package oops;

// Method Overriding Example
class Animal {
    public void sayHello() {
        System.out.println("....");
    }
}

class Dog extends Animal {
    public void sayHello() {
        System.out.println("WOOOOO");
    }

    public void sayBye(){
        System.out.println("Byee Byeee");
    }
}

class Cat extends Animal {
    public void sayHello() {
        System.out.println("Meow");
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();

        Animal dog = new Dog();
        dog.sayHello();
        ((Dog)dog).sayBye(); // downcasting to access Bye method

        Animal cat = new Cat();
        cat.sayHello();
    }
}
