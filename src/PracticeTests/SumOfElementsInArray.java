package PracticeTests;

public class SumOfElementsInArray {

    public static void main(String[] args){

        int a[] = {1,2,3,4,5,6};
        int sum = 0;

        for (int value:a){


            sum = sum + value;
        }

        System.out.println("The Sum of Elements in Array is: "+sum);

    }
}
