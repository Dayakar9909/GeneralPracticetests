package LambdaExamples;

import java.util.function.Predicate;

public class predicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i > 10);

        System.out.println(p.test(20));
        System.out.println(p.test(5));
        System.out.println(p.test(10));

        System.out.println("Second Object reference..............");

        Predicate<String> pr = s -> (s.length() > 4);
        System.out.println(pr.test("Dayakar"));
        System.out.println(pr.test("Sama"));

        System.out.println("After Second Object reference..............");

        String names[] = {"David", "Scott", "Smith", "Jon", "Mar"};
        for (String name : names) {
                if(pr.test(name))
            {
                System.out.println(name);
            }
        }
    }

}
