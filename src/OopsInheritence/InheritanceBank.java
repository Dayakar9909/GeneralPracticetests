package OopsInheritence;

class Bank
{
    int getRateOfInterest()
    {
        return 0;
    }
}

class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 10;
    }
}

class ICICI extends Bank
{
    int getRateOfInterest()
    {
        return 15;
    }
}

class AXIS extends Bank
{
    int getRateOfInterest()
    {
        return 12;
    }
}

public class InheritanceBank {

    public static void main (String[] args){

     SBI sbi = new SBI();
     System.out.println("SBI Bank Interest rate is: "+sbi.getRateOfInterest()+"%");

     ICICI icici = new ICICI();
     System.out.println("ICICI Bank Interest rate is: "+icici.getRateOfInterest()+"%");

     AXIS axis = new AXIS();
     System.out.println("AXIS Bank Interest rate is: "+axis.getRateOfInterest()+"%");

    }

}
