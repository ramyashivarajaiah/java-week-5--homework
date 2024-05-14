package homework_week5_ramya;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme5_ArrayList_Iterater {
    //main method
    public static void main(String[] args) {
        //arraylist
        ArrayList<String> cityList = new ArrayList();
        cityList.add("Mumbai");
        cityList.add("Goa");
        cityList.add("London");
        cityList.add("Patna");
        cityList.add("Delhi");
        System.out.println("ArrayList: " + cityList);

        Iterator itr = cityList.iterator();
        System.out.println("Iterating through ArrayList:1 ");
        while (itr.hasNext()) { // return next element of the Arraylist
            System.out.println(itr.next());
        }
    }
}