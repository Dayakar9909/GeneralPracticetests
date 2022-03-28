package ArrayDesignsAndPatterns;

public class PyramidTwo {

    public static void main(String[] args) {

        final int number = 5;

        System.out.println("Triangle number==01");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        System.out.println("Triangle number==02");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (int) (number - i + 1); j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        System.out.println("Triangle number==03");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (int) (number - i); j++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }

        System.out.println("Triangle number==04");

        for (int i = 1; i <= number; i++) {
            for (int num = 2; num <= i; num++) {
                System.out.print("  ");
            }
            for (int j =1; j <= (int) (number - i + 1); j++){
                System.out.print(j+ "  ");
            }
            System.out.println();
        }
    }
}


