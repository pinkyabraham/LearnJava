/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;
import java.util.*;  
import java.util.HashMap;
/**
 *
 * @author asus
 */
public class Maps {
    
    public static void main(String[] args) {
      // create map
        Map<String, Integer> numbers;
        numbers = new HashMap<>();
      //key value pair
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        System.out.println("Keys: " + numbers.keySet());

 
        System.out.println("Values: " + numbers.values());

        System.out.println("Entries: " + numbers.entrySet());

        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);  // print
    }
}

