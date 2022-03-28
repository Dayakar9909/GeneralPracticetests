package ExceptionExamples;

public class HandleCheckedExceptions {

    public static void main(String[] args){

        System.out.println("Program started now.......................");

        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
           // System.out.println(e.getMessage());
        }
        System.out.println("Program is executed and completed..........");

    }

}
