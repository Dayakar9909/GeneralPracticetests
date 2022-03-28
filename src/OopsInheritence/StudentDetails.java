package OopsInheritence;

import java.util.Scanner;

public class StudentDetails {

  //  Scanner scan = new Scanner(System.in);

    String name = "";
    int marks = 0;

    public StudentDetails(String n, int m){

        name = n;
        marks = m;
    }

  /*  public void get_details(){
        System.out.println("Please Enter Student name: ");
        name = scan.nextLine();
        System.out.println("Please Enter Student Marks: ");
        marks = scan.nextInt();
    } */

    public void show_details(){
        System.out.println("Name of the Student is: "+name);
        System.out.println("Marks of the students are: "+marks);
    }

 }
