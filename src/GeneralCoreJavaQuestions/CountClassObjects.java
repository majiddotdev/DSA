package GeneralCoreJavaQuestions;

public class CountClassObjects {
    static int count = 0;

    CountClassObjects() {
        count++;
    }

    public static void main(String[] args) {
        CountClassObjects countClassObjects = new CountClassObjects();
        System.out.println(count);
        CountClassObjects countClassObjects1 = new CountClassObjects();
        System.out.println(count);
    }
}
