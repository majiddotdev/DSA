public class Test5WaysToCreteObjects implements  Cloneable{
    Test5WaysToCreteObjects() {
        System.out.println("Object created");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
//        Test test = new Test();
//
//        Test test1 = Test.class.newInstance();
//
//        Constructor<?>[] test2 = Constructor.class.getConstructors();

        Test5WaysToCreteObjects test1 = new Test5WaysToCreteObjects();
        Test5WaysToCreteObjects test2 = (Test5WaysToCreteObjects) test1.clone();

    }
}
