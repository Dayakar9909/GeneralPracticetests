package OopsInheritence;

public class NewCar extends NewVehicle {

    String color = "blue";
    int tyres = 4;

    public NewCar(int c, int m, String col, int ty){
        super(c,m);
        color = col;
        tyres = ty;
    }

    public void show_details(){
        System.out.println("I am a Car ");
        System.out.println("Color of Car is: "+color);
        System.out.println("Number of tyres are: "+tyres);
    }

}
