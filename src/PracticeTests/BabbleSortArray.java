package PracticeTests;
import java.util.Arrays;

public class BabbleSortArray {

    public static void main(String[] args)
    {
        int a[] = {2,5,8,10,2,8};

        System.out.println("Array results before babbulesort: "+Arrays.toString(a));

        int n=a.length;

        for (int i=0; i<n-1; i++)
        {
                for (int j=0; j<n-1; j++)
                {
                   if(a[j]>a[j+1])
                   {
                       int temp=a[j];
                       a[j]=a[j-1];
                       a[j+1]=temp;
                   }
                }
        }
        System.out.println("Array results after babbulesort: "+Arrays.toString(a));
    }

}
