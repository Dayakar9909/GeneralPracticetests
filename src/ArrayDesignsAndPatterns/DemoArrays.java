package ArrayDesignsAndPatterns;

import java.util.ArrayList;

public class DemoArrays {

    public static void main(String[] args) {

        String[] strArray = {"India", "USA","Canada","China"};
        strArray [2] = "North Korea";

        for (String states:strArray){
            System.out.println(states);
        }

        System.out.println("==================");

        ArrayList<String> list = new ArrayList<String>();
        list.add("India");
        list.add("China");
        list.add("Australia");
        list.add("Canada");
        list.add("Russia");
        list.add("United States");
        list.add(1, "South Korea");


        for(String sts: list){
            System.out.println(sts);
        }
    }

}
