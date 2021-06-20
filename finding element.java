package CoreJava;
import java.util.*;
public class finding element{ 
public static int first(ArrayList list, int x)

    {

        // return first occurrence index

        // of element x in ArrayList

        // using method indexOf()

        return list.indexOf(x);

    }

    public static int last(ArrayList list, int x)

    {

        // return last occurrence index

        // of element x in ArrayList

        // using method lastIndexOf()

        return list.lastIndexOf(x);

    }

    public static void main(String[] args)

    {

        int arr[] = { 1,  3, 5 , 5, 5, 5, 123, 125,};

        ArrayList<Integer> clist = new ArrayList<>();
 

        // adding elements of array to ArrayList

        for (int i : arr)

            clist.add(i);

        int x = 7;
 

        // displaying the first occurrence

        System.out.println("First Occurrence = "

                           + first(clist, x));
 

        // displaying the last occurance

        System.out.println("Last Occurrence = "

                           + last(clist, x));

    }
}
