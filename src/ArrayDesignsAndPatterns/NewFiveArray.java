package ArrayDesignsAndPatterns;

public class NewFiveArray {

    public static void main(String[] args) {

        int n=15;
        int mid=n/2+1;
        for (int i=1; i<=n; i++){

            for (int j=1;j<=n; j++){

                if(i==1||i==n||i==mid||(j==1&&i<mid)||(j==1||j==n||j==mid)||(j==1&&i>mid))
                {
                    System.out.print("5");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }

}
