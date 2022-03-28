package OopsInheritence;

class Vehicle
{
    final void Run()
    {
        System.out.println("Vehicle is Running on the road");
    }

}

class Bike
{
    void Run()
    {
        System.out.println("Bike is Running on the road");
    }
}

class Car
{
    void Run()
    {
        System.out.println("Car is Running on the road");
    }
}

class Bus
{
    public void Run()
    {
        System.out.println("Bus is Running on the road");
    }
}

class Tractor
{
    void Run()
    {
        System.out.println("Tractor is Running on the road");
    }
}

public class InheritenceVehicle {

    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.Run();

        Car car = new Car();
        car.Run();

        Bus bus = new Bus();
        bus.Run();

        Tractor tractor = new Tractor();
        tractor.Run();
    }

}
