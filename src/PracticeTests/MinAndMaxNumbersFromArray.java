package PracticeTests;

public class MinAndMaxNumbersFromArray {

    public static void main(String[] args){

    /*    int a[] = {5,10,15,40,80,20,200};
        int max=a[0];

        for (int i=1; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum Number from Array is: "+max);
*/
        int a[] = {5,10,15,40,80,20,200};
        int min=a[0];

        for (int i=1; i<a.length; i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Maximum Number from Array is: "+min);

    }

}
