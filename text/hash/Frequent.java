/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequent;


import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author abkar
 */
public class Frequent {

    static String mostFrequent(String arr[], int n) 
    { 
        Hashtable<String, Integer> HM = new Hashtable<String, Integer>();   // the key is string and the value is int
       // HM.containskeys(key) //true if key is found 
       // HM.put(key, val) // add key and value
       // HM.get(key) // retrive a value of a given key 
        int highestFrequency = 0;
        String mostFrequenctString = "";

        // O(n)
        for (String str : arr) 
        {
            int frequency = 1;

            if (HM.containsKey(str)) { //O(n) =1
                frequency = HM.get(str) + 1;
            }
            
            HM.put(str, frequency);
            
            if (frequency > highestFrequency) {
                mostFrequenctString = str;
                highestFrequency = frequency;
            }
        }

        return mostFrequenctString;
    } 

    //Find the most frequent elemnt of an array with time complesity not exceed O(n)
    public static void main (String[] args) { 
          
        String arr[] = {"Toronto", "Ottawa",  "Montreal", "Montreal", "Ottawa", 
            "Montreal", "Vancouver", "Montreal", "Vancouver", "Montreal"};
        int n = arr.length; 
          
        System.out.println(mostFrequent(arr, n)); 
    } 
    
}
