package OopsInheritence;

public class Bikes {

    static int wheels = 2;
    String Color = "";

    public static void main(String[] args) {

        Bikes Enfield = new Bikes();
        Bikes Yamaha = new Bikes();
        Bikes Duke = new Bikes();

        System.out.println("Royal Enfield Bike Wheels are: "+Bikes.wheels);
        System.out.println("Yamaha Bike Wheels are: "+Bikes.wheels);
        System.out.println("Duke Bike Wheels are: "+Bikes.wheels);

        Enfield.Color="Black";
        System.out.print("Enfield Color is: " +Enfield.Color);
        Yamaha.Color="Red";
        System.out.print("Yamaha Color is: "+Yamaha.Color);
        Duke.Color="Purple";
        System.out.print("Duke Color is: "+Duke.Color);

    }
}
