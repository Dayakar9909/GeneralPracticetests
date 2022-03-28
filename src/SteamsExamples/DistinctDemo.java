package SteamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {

    public static void main(String[] args){
    //distinct
        List<String> vehiicleList = Arrays.asList("Bike","Scooter","Car","Truck", "Bus","Train","Flight", "car","Flight");

       // List<String>distinctVehicles=vehiicleList.stream().distinct().collect(Collectors.toList());
       // System.out.println(distinctVehicles);

      //vehiicleList.stream().distinct().forEach(value->System.out.println(value));
            //Count

        long count=vehiicleList.stream().distinct().count();
        System.out.println(count);

    }

}
