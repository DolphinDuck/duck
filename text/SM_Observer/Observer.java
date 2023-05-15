/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sm;

/**
 *
 * @author abusharh
 */
public abstract class Observer {
    
    protected String name; 
    protected MainAccount subject;
    protected boolean restriced;
    protected boolean handled=false;
     public abstract void PhotoUpdate(int photoNumber);
      public abstract void StatusChange(String status);
}
