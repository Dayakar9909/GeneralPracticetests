package PracticeTests;

import java.util.Random;

public class GenerateRandumNumbersAndStrings {

    public static void main (String[] args)
    {
        Random rand = new Random();
       // int rand_int=rand.nextInt(100);
       // System.out.println("Hey Random number in 3 digits is: "+rand_int);

        int rand_int=rand.nextInt(10000);
        System.out.println("Hey Random number in 4 digits is: "+rand_int);

        System.out.println("============================================");

        //System.out.println("Hey Math.Random ramdom number is: "+Math.random());

        //Using Apache API commons.lang3 jar files.. Download and configure with your external libraries
        //String randNum=RandomStringUtils.randomNumeric(10);
        //System.out.println(randNum);

        //Using Apache API for random string
        //String  randStr = RandomStringUtils.randomAlphabetic(10);
        //System.out.println(randStr);
    }

}
