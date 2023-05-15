/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable;

import java.util.ArrayList;

class HashTable 
{ 
    class HashNode
    { 
        public String key; 
        public int value; 
        // Reference to next node 
        public HashNode next; 

        // Constructor 
        public HashNode(String key, int value) 
        { 
            this.key = key; 
            this.value = value; 
        } 
    } 
    // bucketArray is used to store array of chains 
    private ArrayList<HashNode> bucketArray; 
  
    // Current capacity of array list 
    private int numBuckets = 10; 
  
    // Current size of array list 
    private int size; 
  
    // Constructor (Initializes capacity, size and 
    // empty chains. 
    public HashTable() 
    { 
         bucketArray =  new ArrayList<>(); 
        for (int i = 0; i < numBuckets; i++) 
            bucketArray.add(null);
    } 
  
    public int size() { return size; } 
    
    public boolean isEmpty() { return size() == 0; } 
  
    // This implements hash function to find index 
    // for a key 
    private int getBucketIndex(String key) { 
        int hashCode = key.hashCode(); 
        if (hashCode <1) hashCode*=-1; 
        
        int index = hashCode % numBuckets; 
        return index;  
    } 
  
    // Method to remove a given key 
    public int remove(String key) 
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
            if (curr.key.equals(key)) 
                break; 
  
            // Else keep moving in chain 
            prev = curr; 
            curr = curr.next; 
        } 
  
        // If key was not there 
        if (curr == null) 
            return -1; 
  
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
    public int get(String key) 
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
        return -1; 
    } 
  
    // Adds a key value pair to hash 
    public void put(String key, int value) 
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
    
     public boolean containsKey(String key) 
    { 
        // Find head of chain for given key 
        int bucketIndex = getBucketIndex(key); 
        HashNode head = bucketArray.get(bucketIndex); 
        boolean ret=false; 
        // Search key in chain 
        while (head != null) 
        { 
            if (head.key==key){ 
                ret=true; 
                break;
            }
            head = head.next; 
        } 
  
        // If key not found 
        return ret; 
    }
}