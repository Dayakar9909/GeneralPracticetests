package OopsInheritence;

public class ExampleTwo {

    int x=10;
    static int y=20;

    public static void main(String[] args) {

        ExampleTwo et = new ExampleTwo();
        et.x=200; y=50;
        System.out.println("Value of X: "+et.x);
        System.out.println("Value of int: "+y);

    }
}
