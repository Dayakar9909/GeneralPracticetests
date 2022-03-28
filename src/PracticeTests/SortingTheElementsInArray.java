package PracticeTests;

import java.util.Arrays;
import java.util.Collections;

public class SortingTheElementsInArray {

    public static void main(String[] args)

    {
        Integer a[] = {2,5,8,78,10,200,450};

        // System.out.println("Array results before babbulesort: "+ Arrays.toString(a));
        // Arrays.sort(a);
        //System.out.println("Array results after babbulesort: "+ Arrays.toString(a));

       // System.out.println("===============================")

        System.out.println("Array results before babbulesort: "+ Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Array results after babbulesort: "+ Arrays.toString(a));
    }
}
