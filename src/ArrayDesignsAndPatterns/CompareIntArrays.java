package ArrayDesignsAndPatterns;

import java.util.Arrays;

public class CompareIntArrays {

    public static void main(String[] args) {

        int[] grades1 = {1,2,3,30,50};
        int[] grades2 = {1,2,3,30,50};

        if(Arrays.equals(grades1,grades2)){
           System.out.println("Finally Equals");
        }

       // int[] grades = {1,2,3,4,5,6};
        String[] grades = new String[8];
        Arrays.fill(grades, "Dayakar");

        System.out.println(Arrays.toString(grades));
    }
}
