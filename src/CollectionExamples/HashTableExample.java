package CollectionExamples;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args){

        Hashtable<Integer,String> hs = new Hashtable<Integer,String>();

        hs.put(1001, "Boris");
        hs.put(1002, "Smith");
        hs.put(1003, "Steve");
        hs.put(1041, "Sajjad");

        System.out.println(hs);
        System.out.println("====================");

        for(Object i:hs.keySet())
        {
            System.out.println(i+ " " +hs.get(i));
        }

        System.out.println(hs.keySet());
        System.out.println(hs.values());
        System.out.println(hs.entrySet());

        for (Map.Entry entry:hs.entrySet())
        {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

    }

}
