/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionbike;

abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){
       System.out.println("gear changed");
   }  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
     public Honda()
     {
         System.out.println("Honda bike is created");
     }
 void run()
 {
     System.out.println("running safely..");}  
 }  


//Creating a Test class which calls abstract and non-abstract methods  
 class AbstractionBike{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  