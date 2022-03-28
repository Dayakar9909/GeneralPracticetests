package LambdaExamples;

interface Cab1
{
    public String bookCab(String source, String destination);
}

class Ola implements Cab1
{
    public String bookCab(String source, String destination){
           System.out.println("Mr Sama your Ola Cab is booked........."+source+" "+destination);
           return ("Price: Rs 15000");

    }
}

public class Test {

    public static void main(String[] args){
  //  Cab1 cab = (source, destination)->System.out.println("Mr Sama your Ola cab is booked...... "+source+" "+destination);
        Cab1 cab = new Ola();
        cab.bookCab("Hyderabad  ",  "Rajasthan");

    }
}
