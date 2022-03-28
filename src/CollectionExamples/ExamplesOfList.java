package CollectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExamplesOfList {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();


            al.add("K");
            al.add("M");
            al.add("C");
            al.add("B");
            al.add("X");
            al.add("Z");
            al.add("D");
            al.add("A");

            System.out.println(al);

            Collections.sort(al);
            System.out.println("Collections after sorting: "+al);

            Collections.reverse(al);
        System.out.println("Elements after reverse sorting: "+al);

        }

    }


