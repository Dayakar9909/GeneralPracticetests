package ExamplesOfClasses;

public class Calculation {

    int a;
    int b;

    //Method without  parameters
   /* void sum()
    {
        System.out.println(a+b);
    }
    */
    //Method take parameters

   // void sum(int x, int y)
   /* {
        a=x;
        a=y;
        System.out.println(a+b);
    } */
    int sum()
    {
        return(a+b);
    }

    public static void main(String[] args)
    {
        Calculation cal = new Calculation();
      //  cal.a=100;
      //  cal.b=200;
      //  cal.sum();
      //  cal.sum(200,400);

        cal.a=500;
        cal.b=300;
        int c=cal.sum();
        System.out.println(c);

    }
}
