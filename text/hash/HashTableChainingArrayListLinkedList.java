/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

// Java program to demonstrate implementation of our 
// own hash table with chaining for collision detection 
import java.util.ArrayList; 
  
  
// Class to represent entire hash table 
class HashTableChainingArrayListLinkedList 
{ 
    class HashNode
    { 
        public int key; 
        public String value; 
        // Reference to next node 
        public HashNode next; 

        // Constructor 
        public HashNode(int key, String value) 
        { 
            this.key = key; 
            this.value = value; 
        } 
    } 
    // bucketArray is used to store array of chains 
    private ArrayList<HashNode> bucketArray; 
  
    // Current capacity of array list 
    private int numBuckets; 
  
    // Current size of array list 
    private int size; 
  
    // Constructor (Initializes capacity, size and 
    // empty chains. 
    public HashTableChainingArrayListLinkedList() 
    { 
         bucketArray =  new ArrayList<>(); 
        for (int i = 0; i < 6; i++) 
            bucketArray.add(null);
    } 
  
    public int size() { return size; } 
    
    public boolean isEmpty() { return size() == 0; } 
  
    // This implements hash function to find index 
    // for a key 
    private int getBucketIndex(int key) 
    { 
         Integer integerKey = new Integer(key);

        int hashCode = integerKey.hashCode(); 
        int index = key % 6; 
        return index;  
    } 
  
    // Method to remove a given key 
    public String remove(int key) 
    { 
        // Apply hash function to find index for given key 
        int bucketIndex = getBucketIndex(key); 
  
        // Get head of chain 
        HashNode head = bucketArray.get(bucketIndex); 
        HashNode curr = head ;  
        // Search for key in its chain 
        HashNode prev = null; 
        while (curr != null) 
        { 
            // If Key found 
            if (curr.key==key) 
                break; 
  
            // Else keep moving in chain 
            prev = curr; 
            curr = curr.next; 
        } 
  
        // If key was not there 
        if (curr == null) 
            return "-1"; 
  
        // Reduce size 
        size--; 
  
        // Remove key 
        if (prev != null) 
            prev.next = curr.next; 
        else
            bucketArray.set(bucketIndex, curr.next); 
  
        return curr.value; 
    } 
  
    // Returns value for a key 
    public String get(int key) 
    { 
        // Find head of chain for given key 
        int bucketIndex = getBucketIndex(key); 
        HashNode head = bucketArray.get(bucketIndex); 
  
        // Search key in chain 
        while (head != null) 
        { 
            if (head.key==key) 
                return head.value; 
            head = head.next; 
        } 
  
        // If key not found 
        return "-1"; 
    } 
  
    // Adds a key value pair to hash 
    public void add(int key, String value) 
    { 
       // Find head of chain for given key 
        int bucketIndex = getBucketIndex(key); 
        HashNode head = bucketArray.get(bucketIndex); 
  
        // Check if key is already present 
        while (head != null) 
        { 
            if (head.key==key) 
            { 
                head.value = value; 
                return; 
            } 
            head = head.next; 
        } 
  
        // Insert key in chain 
        size++; 
        HashNode curr = bucketArray.get(bucketIndex); 
        HashNode newNode = new HashNode(key, value); 
        newNode.next = curr; 
        bucketArray.set(bucketIndex, newNode);
}
  
    // Driver method to test Map class 
    public static void main(String[] args) 
    { 
        HashTableChainingArrayListLinkedList map = new HashTableChainingArrayListLinkedList (); 
        map.add(0, "John");  //0                     
        map.add(3, "Ali");  // 3      
        map.add(18, "Khan");  //0 
        map.add(10, "wang");  // 4
        map.add(9, "Oscar");  //3       
        map.add(132,"jessica" );  // 0 
        map.add(6,"Amin" );  // 0
        map.add(10,"Vanier" );  // 4
        
        System.out.println(map.get(3)); 
        
         
        System.out.println(map.size()); 
        System.out.println(map.remove(10)); 
        System.out.println(map.remove(30)); 
        System.out.println(map.size()); 
        System.out.println(map.isEmpty()); 
    } 
} 