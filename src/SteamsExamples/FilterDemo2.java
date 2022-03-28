package SteamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

    public static void main(String[] args){

        List<String>names= Arrays.asList("Dayakar","Rama","Joffery","Nirali","Tendulkar");
        List<String>longnames=new ArrayList<String>();

        names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));

        System.out.println(names);

        names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);

    }
}
