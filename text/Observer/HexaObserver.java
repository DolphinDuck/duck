/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpatterndemo;

public class HexaObserver extends Observer{

   public HexaObserver(Subject subject, boolean att){
       this.subject = subject;
      if (att)
        this.subject.attach(this);
      else
          this.subject.detach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}