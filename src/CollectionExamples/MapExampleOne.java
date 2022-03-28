package CollectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExampleOne {

    public static void main (String[] args){

       // HashMap m = new HashMap();
        HashMap<Integer,String> m = new HashMap<Integer, String>();

        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Mary");
        m.put(104, "Dayakar");
        m.put(105, "Nirali");
        m.put(106, "Tendulkar");
       // m.put(101, "Janet");

      //  System.out.println(m);

       // System.out.println(m.containsValue("Janet"));
       // System.out.println(m.isEmpty());
       // System.out.println(m.keySet());

    /*    for (Object i:m.keySet())
        {
            System.out.println(i);
        }
       // System.out.println(m.entrySet());
        System.out.println(m.values());

        for (Object i:m.values())
        {
            System.out.println(i);
        }
        System.out.println("======================");

        for(Object i:m.keySet())
        {
            System.out.println(i+ " " +m.get(i));
        }

        // Entry Methods
        System.out.println("======================");
        for (Map.Entry entry:m.entrySet())
        {
            System.out.println (entry.getKey()+ " "+entry.getValue());
        }
    */
        System.out.println("======================");
        Set s = m.entrySet();
        Iterator itr = s.iterator();
            while (itr.hasNext())
            {
               Map.Entry entry=(Entry) itr.next();
               System.out.println(entry.getKey()+ " "+entry.getValue());

            }
    }

}
