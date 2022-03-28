package ArrayDesignsAndPatterns;

public class SquareArray {

    public static void main(String[] args) {

        int num=5;

        System.out.println("This is Rectangle========001");
        for (int i=1; i<=num; i++)
         {
            for (int j=1; j<=num; j++)
                 {
                    System.out.print(" *");
                 }
            System.out.println();
         }

        System.out.println("This is Traingle========002");

        for (int i=1; i<=num; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("  * ");
            }
            System.out.println();
        }

        System.out.println("This is Reverse Traingle========003");
        for (int i=1; i<=num; i++)
        {
            for (int j=i; j<=num; j++)
            {
                System.out.print("  * ");
            }
            System.out.println();
        }

        System.out.println("This is Hill Pattern========004");
        for (int i=1; i<=num; i++)
        {
            for (int j=i; j<=num; j++)
            {
                System.out.print(" ");
            }
         for (int j=1; j< i; j++){
             System.out.print("*");
         }

         for (int j=1; j<=i; j++){
             System.out.print("*");
         }
            System.out.println();
        }

        System.out.println("This is Reverse Hill Pattern========005");
        for (int i=1; i<=num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
