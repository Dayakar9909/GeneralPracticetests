package OopsInheritence;

public class ExamplesOfStatics {

    int a;
    static int b;

    static void m1()
    {
        System.out.println("This is static method example...........");
    }

    void m2()
    {
        System.out.println("This is non-static method example.......");
    }


    public static void main(String[] args)
    {
        b=100;
        System.out.println("This is static example...."+b);
        m1();

        ExamplesOfStatics exp = new ExamplesOfStatics();
        System.out.println("========================================");
        System.out.println(exp.a=100);
        exp.m2();

    }
}
