package java_programs;

@FunctionalInterface
interface MyFunctional {
    void show();
}

public class Main {
    public static void main(String[] args) {
        MyFunctional m = () -> System.out.println("Show");
        m.show();
    }
}

//public class Main {
//    MyFunctional m = () -> System.out.println("Show");
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        m.call();
//    }
//
//    public void call() {
//        m.show();
//    }
//}


//public class Main implements MyFunctional {
//
//    @Override
//    public void show() {
//        System.out.println("SHOW");
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        m.show();
//    }
//}
