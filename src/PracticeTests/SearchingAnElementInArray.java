package PracticeTests;

public class SearchingAnElementInArray {

    public  static void main(String[] args)
    {
        int a[] = {20,40,10,50,120,80};
        int search_ele=80;
        boolean flag = false;

        for (int i=0; i<a.length-1; i++)
        {
            System.out.println(a[i]);
            if(search_ele==a[i])
            {
                System.out.println("Element vound at: "+i);
                flag=true;
                break;
            }
        }

        if (flag==false)
        {
            System.out.println("Element not found");
        }
    }
}
