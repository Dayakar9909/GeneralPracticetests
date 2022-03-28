package SteamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee
{
    int empid;
    String empname;
    int salary;

    Employee (int empid, String empname, int salary)
    {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class MapDemo4 {

    public static void main(String[] args){

        List<Employee> employeeList = Arrays.asList(
        new Employee (101, "Alex", 25000),
        new Employee (102, "Dayakar", 20000),
        new Employee (103, "Nirali", 35000),
        new Employee (104, "Murali", 55000),
        new Employee (105, "Tendulkar", 85000)
        );

        //System.out.println(employeeList);
        employeeList.stream().filter(e->e.salary>20000).map(e->e.salary<30000);
        System.out.println(employeeList);

    }

}
