package LambdaExamples;

@FunctionalInterface
interface Cab
{
    public void bookCab();
}

/*class Ola implements Cab
{
    public void bookCab()
    {
        System.out.println("Ola Cab is booked for you...........");
    }
} */

public class FirstLambdaExample {


    public static void main(String[] args)
    {
        Cab cab=()->System.out.println("Mr Dayakar Sama, Ola Cab is booked for you.....");
        cab.bookCab();
    }

}
