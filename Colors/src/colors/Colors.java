
package colors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Colors {


    public static void main(String[] args) {
        
        Scanner colors = new Scanner(System.in);//Giving input
        System.out.println("Please enter your favorite colors!!!!");//Prompt message for the user
        String [] colorful = new String[4];//Declaring the arry
        colorful[0] = colors.nextLine();//Inserting input in  the array
        colorful[1] = colors.nextLine();
        colorful[2] = colors.nextLine();
        colorful[3] = colors.nextLine();
        
        Arrays.sort(colorful);//Sorting
        
        for (String colorful1 : colorful) {
            System.out.println("Wanted colors " + colorful1);//Sorted output
        }
        
        LinkedList <String >listy = new LinkedList<>();//Creating a list for the output
        listy.add(colorful[0]);
        listy.add(colorful[1]);
        listy.add(colorful[2]);
        listy.add(colorful[3]);//Inserting the output in the list
        
        System.out.println("Now the colors are on a list!!!");//Another message for the user
        System.out.println(listy);//List output

    }
    
}
