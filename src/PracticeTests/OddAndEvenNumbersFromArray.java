package PracticeTests;

public class OddAndEvenNumbersFromArray {

    public static void main(String[] args){

        int a[] = {1,2,3,4,5,6,7,8,9,10};

      /*  for (int i=0; i<=a.length; i++)
      //  {
      //  if (a[i] % 2==0)
      //          System.out.println("Even Numbers from Array is: "+a[i]);
      //  }

        for (int i=0; i<=a.length; i++)
        {
            if (a[i] % 2!=0)
                System.out.println("Odd Numbers from Array: "+a[i]);
        }
       */
        System.out.println("Odd Numbers in Array is................");
        for (int value : a)
        {
            if (value%2!=0)
                System.out.print(value+",");
        }
    }
}
