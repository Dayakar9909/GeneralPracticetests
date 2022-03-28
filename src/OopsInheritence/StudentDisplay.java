package OopsInheritence;
import java.util.Scanner;

public class StudentDisplay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost of your Vehicle: ");
        int cost = scan.nextInt();

        System.out.println("Enter Mileage of your Vehicle: ");
        int mileage=scan.nextInt();

        System.out.println("Enter Color of your Vehicle: ");
        String color=scan.next();

        System.out.println("Enter number of tyres of your Vehicle: ");
        int tyres=scan.nextInt();

       // StudentDetails std = new StudentDetails(Student_name, Student_marks);
        NewCar car = new NewCar(cost,mileage,color,tyres);
        car.show_vehicle_details();
        car.show_details();

       // std.show_details();

    }

}
