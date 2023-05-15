/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;
class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    }
public class LinkedList { 
  
    Node head; // head of list 
    
    public static void insertAtEnd(LinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = null; 

        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
    } 
  
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
  
        System.out.print("\nLinkedList: "); 
  
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
    } 
  
    public static void skipMdeleteN(LinkedList list, int m, int n)
    {
        Node curr = list.head; 
        int count =0; 
        while (curr != null && count <m)
        {    
            count++; 
            curr = curr.next; 
        }
        if (curr.next==null && curr ==null)
        {
            return; 
        }
        Node temp=curr.next; 
        count=0; 
        while (temp != null && count <n)
        {
            temp = temp.next; 
            count++;
        }
        curr.next = temp; 
    }
   
    static void fun(Node start)
    {
        if(start == null)
        return;
        System.out.println(start.data+" "); 
        if(start.next != null)
        fun(start.next.next);
        System.out.println(start.data+ " ");
    }


    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 

        insertAtEnd(list, 1); 
        insertAtEnd(list, 2); 
        insertAtEnd(list, 3); 
        insertAtEnd(list, 4); 
        insertAtEnd(list, 5); 
        insertAtEnd(list, 6); 
        insertAtEnd(list, 7); 
        printList(list); 
        System.out.println();
        fun(list.head); 
        
        
        skipMdeleteN(list, 1, 2); 
        printList(list); 
        
        skipMdeleteN(list, 2, 3); 
        printList(list); 
  

    } 
    
    
} 
