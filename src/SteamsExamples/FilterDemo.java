package SteamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args){

        List<Integer> numbersList= Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumbersList=new ArrayList<Integer>();

        //Method one:
      /*  for (int n:numbersList)
        {
            if(n%2==0)
                evenNumbersList.add(n);
        }
        System.out.println(evenNumbersList); */

        // Method two is:
      //  evenNumbersList= numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
      //  System.out.println("Even Numbers from the list is:......"+evenNumbersList);

       // numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        numbersList.stream().filter(n->n%2==0).forEach(System.out::println);

    }

}
