public class Abc {
    String i , j;
    Abc(String i , String j){
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        Abc abc = new Abc("a", "b");
        System.out.println(abc.i + " " + abc.j);
    }
}
