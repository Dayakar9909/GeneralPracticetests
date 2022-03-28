package ArrayDesignsAndPatterns;

public class PlusArray {

    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i=i+2) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num)
                    System.out.print("* ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("This is Next Pattern Number = 002");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == num / 2 + 1 || j == num / 2 + 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("This is Pattern Three=====003");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i + j == num + 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
            System.out.println("This is Fourth Pattern====004");

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i == num || j == 1 || j == i)
                        System.out.print("* ");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

