package homework_week5_ramya;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values
 */
public class Programme3_Reverse_Array {
    //create method
    public void reverseArray() {
        int[] my_array1 = {10, 20, 30, 40, 50};
        System.out.println("Original array : " + Arrays.toString(my_array1));
        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));
    }

    //main method
    public static void main(String[] args) {
        Programme3_Reverse_Array obj = new Programme3_Reverse_Array();
        obj.reverseArray();
    }
}