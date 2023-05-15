/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

// Java program to demonstrate implementation of our 
// own hash table with chaining for collision detection 
import java.util.ArrayList; 
import java.util.Hashtable;
  
  
// Class to represent entire hash table 
class HashTableFrequent 
{ 
    
    static String mostFrequent(String arr[], int n) 
    { 
        HashTable HM = new HashTable();   // the key is string and the value is int
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
    public static void main(String[] args) 
    { 
         String arr[] = {"Toronto", "Ottawa",  "Montreal", "Montreal", "Ottawa", 
            "Montreal", "Vancouver", "Montreal", "Vancouver", "Montreal"};
        int n = arr.length; 
          
        System.out.println(mostFrequent(arr, n)); 
    } 
} 