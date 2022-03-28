package ExamplesOfLoops;

import java.util.Scanner;

public class DoubleWhileLoop {

    public static void main(String[] args) {
        /*
        icu
        initialization
        comparison
        update
        */

     /*   String password = "let me in";
        System.out.println("Guess the password: ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();


        while (!guess.equals(password)){
            System.out.println("Guess the password: ");
            guess = scanner.nextLine();
        }
            System.out.println("Congrats you are in now!");
*/
       /* int i = 1;
        while (i<10){
            System.out.println("Iteration is: "+i);
            i++;
        }*/

        String password = "let me in";
        Scanner scanner = new Scanner(System.in);
        String guess;
        do
            {
                System.out.println("Guess the password");
                guess = scanner.nextLine();
             } while (!guess.equals(password));
            System.out.println("Congrats");
            scanner.close();
    }
}
