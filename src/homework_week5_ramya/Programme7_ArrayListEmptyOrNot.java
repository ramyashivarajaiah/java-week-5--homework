package homework_week5_ramya;

import java.util.ArrayList;

/**
 * 7.Write a Java program to test if an array list is empty or not
 */
public class Programme7_ArrayListEmptyOrNot {
    //main method
    public static void main(String[] args) {
        //Arraylist
        ArrayList<String> name = new ArrayList();
        // using boolean check if the list is empty or not
        boolean ans = name.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is Empty");
        } else {
            System.out.println("The ArrayList is Not Empty"); // ref: https://www.geeksforgeeks.org/arraylist-isempty-java-example/
        }
        name.add("Jatin");
        name.add("Ruby");
        name.add("Derek");
        name.add("Femina");
        name.add("Gopi");
        System.out.println("Addition of elements to the array list: " + name);

// checking if list is empty or not
        if (name.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The Arraylist is not empty");
        }
    }


}