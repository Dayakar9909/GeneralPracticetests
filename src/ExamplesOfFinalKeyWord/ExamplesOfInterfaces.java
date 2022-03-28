package ExamplesOfFinalKeyWord;

interface Testinter
{
    int a = 100;
    void display();
}

public class ExamplesOfInterfaces implements Testinter {

   public void display()
           
   {
       System.out.println(a);
   }

    public static void main(String[] args){

        ExamplesOfInterfaces expint = new ExamplesOfInterfaces();
        expint.display();
    }
}
