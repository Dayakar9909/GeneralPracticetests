package TimePass;

import java.util.Scanner;

public class OopsConceptOne {

    static int i;
    int s;

    static void min (int a, int b){

        if (a<b) {
            System.out.println(a + " is the Minimum value ");
        }
        else
            System.out.println(b+" is the Minimum value ");
        }

        public static void main(String[] args) {

       // OopsConceptOne one = new OopsConceptOne();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 2 numbers: ");
        int c = scan.nextInt();
        int d = scan.nextInt();
        min(c,d);
    }

}
