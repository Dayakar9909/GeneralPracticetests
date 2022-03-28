package ArrayDesignsAndPatterns;

public class DiamondArray {

    public static void main(String[] args) {

        System.out.println("This is Hill Pattern========004");
        int num = 5;

        for (int i=0; i<= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0; i<=num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
