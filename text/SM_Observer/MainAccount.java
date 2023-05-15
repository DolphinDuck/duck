/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abusharh
 */
public class MainAccount {
    List<Observer> observers = new ArrayList<Observer>();
     List<Observer> pendingObservers = new ArrayList<Observer>(); 
    int photoId = 0;
    String status ="no status"; 
    public void AddFriend(Observer observer) {
        
        pendingObservers.add(observer);
    }
    public void RemoveFriend(Observer observer) {
        observers.remove(observer);
    }
    
    public void HandleRequests()
    {
        Scanner scan = new Scanner(System.in);
        int choice = 0; 
        
        for (Observer obs : pendingObservers){
            if (obs.handled==false)
            {
                System.out.println("To approve as normal friend "+obs.name +" press 1");
                System.out.println("To approve as restricted friend "+obs.name +" press 2");
                System.out.println("To siapproveapprove "+obs.name +" press 0");
                choice = scan.nextInt(); 
                obs.handled=true;
                switch (choice)
                {
                    case 1: 
                        obs.restriced=false;
                        observers.add(obs);
                      //  pendingObservers.remove(obs); 
                        break; 
                     case 2: 
                        obs.restriced=true;
                        observers.add(obs);
                      //  pendingObservers.remove(obs); 
                        break;
                     case 0:
                     //    pendingObservers.remove(obs); 
                         break;
                     default : 
                         System.out.println("Get Lost, wrong choice!"); 
                         break; 

                }
            }
        }
        
        
        pendingObservers.clear();
         
    }
    
    public void NotifyAll(int photoNumber, String status)
    {
        for (Observer obs : observers){
            obs.PhotoUpdate( photoNumber); 
            obs.StatusChange( status);
        }
    }
    
    public void PhotoPostAll(int photoNumber)
    {
        for (Observer obs : observers){
            obs.PhotoUpdate( photoNumber); 
        }
    }
    public void StatusChangeAll(String status)
    {
        for (Observer obs : observers){
            obs.StatusChange( status); 
        }
    }
    
    public void StatusChangeNormalFriends(String status)
    {
        for (Observer obs : observers){
            if (obs.restriced == false)
                obs.StatusChange( status); 
        }
    }
    
    public void PrintRestricedFriends()
    {
        System.out.println("List of restricted fiends is");
        for (Observer obs : observers){
            if (obs.restriced == true)
                System.out.println(obs.name); 
        }
    }
    
    public void PrintAllFriends()
    {
        System.out.println("List of all fiends is");
        for (Observer obs : observers){
            if (obs.restriced == true) 
                System.out.println(obs.name+" is restricted"); 
            else 
                System.out.println(obs.name+" is not restricted"); 
        }
    }
    
    
}
