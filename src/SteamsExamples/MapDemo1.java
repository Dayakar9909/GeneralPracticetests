package SteamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args){

        List<String> vehicles = Arrays.asList("Car","Bus","Bicycle","Flight","Train");
        List<String> VehiclesListinUpperCase = new ArrayList<String>();

        //Before applying Streams Concept
     /*   for(String name:vehicles)
        {
            VehiclesListinUpperCase.add(name.toUpperCase());
        }
        System.out.println(VehiclesListinUpperCase);
    */
        //Using Streams Concept
        VehiclesListinUpperCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(VehiclesListinUpperCase);
    }

}
