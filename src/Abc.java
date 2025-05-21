public class Abc {
    String i , j;
    Abc(String i , String j){
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        final Abc abc = new Abc(null , null);
        System.out.println(abc.i + " " + abc.j);
    }
}
