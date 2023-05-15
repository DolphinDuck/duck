/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm;

/**
 *
 * @author abusharh
 */
public class RestrictedFriend  extends Observer  {
    
     RestrictedFriend(MainAccount subject, String name){
        this.subject=subject;
        subject.AddFriend(this);
        this.name=name; 
        restriced=true; 
    }
     
    public  void PhotoUpdate(int photoNumber){
        System.out.println("NormalFriend PhotoUpdate: "+photoNumber+" and I am "+this.name);
    }
      public  void StatusChange(String StatusChange){
           System.out.println("NormalFriend StatusChange: "+StatusChange+" and I am "+this.name);
      }
}
