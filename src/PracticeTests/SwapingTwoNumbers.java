package PracticeTests;

public class SwapingTwoNumbers {

    public static void main(String[] args)
    {
        int a=10, b=20;

        System.out.println("Before Swaping the values are: "+a+" "+b);

        int t=a;
        a=b;
        b=t;

        System.out.println("After Swaping the values are: "+a+" "+b);
    }

}
