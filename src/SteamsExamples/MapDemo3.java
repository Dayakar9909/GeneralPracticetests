package SteamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

    public static void main(String[] args){

        List<Integer> numbersList = Arrays.asList(2,3,4,5,6,7,8);
        List<Integer> multipliedList = new ArrayList<Integer>();

        //Before Streams concept
   /*     for(int num:numbersList)
        {
            multipliedList.add(num*3);
        }    */

        multipliedList = numbersList.stream().map(num->num*5).collect(Collectors.toList());
        System.out.println(multipliedList);

       numbersList.stream().map(num->num*4).forEach(System.out::println);

    }

}
