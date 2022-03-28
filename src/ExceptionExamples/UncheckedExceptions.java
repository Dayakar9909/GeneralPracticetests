package ExceptionExamples;

public class UncheckedExceptions {


    public static void main(String[] args)
    {
        System.out.println("Program is Started.......");
        int a=30;
        try {
            System.out.println(a / 0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
    }
        String s=null;

        try {
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

     /*   String st="abcdef";
        int i=Integer.parseInt(st);

        try {
            System.out.println(i);
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
      //  int arr[]=new int[s];
      //  arr[10]=100; */
    }

}
