/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpatterndemo;

public class BinaryObserver extends Observer{

   public BinaryObserver(Subject subject, boolean att){
      this.subject = subject;
      if (att)
        this.subject.attach(this);
      else
          this.subject.detach(this);

   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}