/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerexample;

public class ObserverExample {
   public static void main(String[] args) {
      
       System.out.println();

        Subject subject = new Subject();   
        
        ConcreteObserverA observerA = new ConcreteObserverA(subject);
        ConcreteObserverB observerB = new ConcreteObserverB(subject);

        subject.notifyObservers();
        System.out.println("subject.unregisterObserver(observerA)\n");
        
        subject.unregisterObserver(observerA);
        subject.notifyObservers();

        System.out.println();
   }
}
