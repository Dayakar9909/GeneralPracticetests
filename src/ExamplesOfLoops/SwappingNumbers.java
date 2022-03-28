package ExamplesOfLoops;

public class SwappingNumbers {

    public static void main(String[] args){

        int a=10;
        int b=20;
        int c;

        System.out.println("The A value before Swapping......"+a);
        System.out.println("The b value before Swapping......"+b);

        c=a;
        a=b;
        b=c;

        System.out.println("The A value after Swapping......"+a);
        System.out.println("The b value after Swapping......"+b);

        int number=10;
        if (number%2==0)
        {
            System.out.println("This Number is Even....."+number);
        }
        else
        {
            System.out.println("This is Odd Number....."+number);
        }

    }

}
