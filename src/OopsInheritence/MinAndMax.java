package OopsInheritence;

import java.util.Scanner;

public class MinAndMax {

    int i;
    int s;

    void min(int a, int b)
    {
        if (a>b)
            System.out.println(+a+ "is Max");
        else
            System.out.println(+b+ "is max");

    }

    public static void main(String[] args) {

        MinAndMax mm = new MinAndMax();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any 2 numbers");
        int c=sc.nextInt();
        int d=sc.nextInt();
        mm.min(c,d);
    }

}
