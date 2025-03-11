package GeneralCoreJavaQuestions;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        System.out.println(singletonClass1 == singletonClass2); // true
    }
}
