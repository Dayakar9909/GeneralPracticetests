package PracticeTests;

public class ReverseAstring {

    public static void main(String[] args){

        String str = "Dayakar Sama";
        String rev;

        System.out.println("String value before reverse the String is: "+str);

        StringBuffer sb = new StringBuffer(str);
        System.out.println("String value after reverse the String: "+sb.reverse());
        System.out.println("Length of the String is: "+sb.length());

        if (sb.length()>10){

            System.out.println("Hey your name is exceeded the length");
        }

    }

}
