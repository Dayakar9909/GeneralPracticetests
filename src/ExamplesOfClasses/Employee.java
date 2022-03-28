package ExamplesOfClasses;

public class Employee {

    int empid;
    String empname;
    int salary;
    int deptno;

   /* Employee(int id, String name, int sal, int dept)
    {
        empid = id;
        empname=name;
        salary=sal;
        deptno=dept;
    } */

    void setData(int id, String name, int sal, int dept)
    {
        empid = id;
        empname=name;
        salary=sal;
        deptno=dept;
    }


    void display()
    {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptno);


        }

    public static void main(String[] args)
    {
   /*     Employee emp1 = new Employee();
        emp1.empid=101;
        emp1.empname="Dayakar Sama";
        emp1.salary = 320000;
        emp1.deptno=518;
        emp1.display();
        System.out.println("Second Employee Record.....");

        Employee emp2 = new Employee();
        emp2.empid=201;
        emp2.empname="Nirali Sama";
        emp2.salary = 480000;
        emp2.deptno=918;
        emp2.display();
    */
        //Using constructor
     /*   Employee emp1 = new Employee(102, "Raj", 120000, 205);
        emp1.display();

        Employee emp2 = new Employee(301, "Rakul", 160000, 105);
        emp1.display();
*/
        Employee emp3 = new Employee();
        emp3.setData(001, "Ram", 30000, 004);
        emp3.display();

        Employee emp4 = new Employee();
        emp3.setData(002, "Raghav", 25000, 005);
        emp3.display();
    }
}
