package SteamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

    public static void main(String[] args){

        List<String> vehicles = Arrays.asList("Bus", "Car", "Truck", "Train", "Flight");

      /*  for(String name:vehicles)
        {
            System.out.println(name.length());
        } */

       // vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));

        vehicles.stream().map(vname->vname.length()).forEach(System.out::println);


    }

}
