package homework_week5_ramya;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme9_HashMap {
    //main method
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<String, Integer>();
        people.put("Josh", 22);
        people.put("Shreya", 20);
        people.put("Komal", 28);
        people.put("Jasmin", 23);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " & " + " value: " + people.get(i));
        }
    }
}