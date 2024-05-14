package homework_week5_ramya;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4_ArrayListColour {
    //main method
    public static void main(String[] args) {
        // creation of array list
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Red");
        colourList.add("Orange");
        colourList.add("Brown");
        colourList.add("Pink");
        colourList.add("White");
        colourList.add("Black");
        for (String colourName : colourList) {
            System.out.println(colourName);
        }
    }
}