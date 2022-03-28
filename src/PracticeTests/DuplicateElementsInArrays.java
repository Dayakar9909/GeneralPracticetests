package PracticeTests;

import java.util.HashSet;

public class DuplicateElementsInArrays {

    public static void main(String[] args){

        String arr[] = {"java", "python", "php","C++","java"};

        boolean flag=false;
    /*    boolean flag=false;

        for (int i=0; i<arr.length;  i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                   System.out.println("Found Duplicate Element: "+arr[i]);
                   flag=true;
                }
            }
        }

        if (flag==false)
             {
                System.out.println("Duplicate Element Not Found");
             }

     */

        HashSet <String> langs = new HashSet();

        for (String lang:arr)
        {
            if (langs.add(lang)==false)
            {
                System.out.println("Hey Duplicate Element found here: "+lang);
                flag = true;
            }
        }
            if (flag == false)
            {
                System.out.println("Hey Congrats there is No Duplicates:");
            }
        }
                                                               }


