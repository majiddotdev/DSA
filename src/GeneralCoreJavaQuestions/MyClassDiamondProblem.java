package GeneralCoreJavaQuestions;
interface A {
     default void show() {
        System.out.println("A's show");
    }
}

interface B {
     default void show() {
        System.out.println("B's show");
    }
}

class MyClass implements A, B {
    @Override
    public void show() {
        A.super.show();
    }
}

public class MyClassDiamondProblem {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}


//interface A {
//    void show();
//}
//
//interface B {
//    void show();
//}
//
//class MyClass implements A, B {
//    @Override
//    public void show() {
//        System.out.println("Implementing show()");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.show();
//    }
//}
//

