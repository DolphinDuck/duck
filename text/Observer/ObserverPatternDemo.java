/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpatterndemo;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      
       Subject subject1 = new Subject();

      new HexaObserver(subject1, true);
      new OctalObserver(subject1, true);
      new BinaryObserver(subject1, true);

      System.out.println("First state change: 15");	
      subject1.setState(15);
      System.out.println("\nSecond state change: 10");	
      subject1.setState(10);
 
      new BinaryObserver(subject1, false);
      System.out.println("\nThird state change: 5");	
      subject1.setState(5);
      
      
      Subject subject2 = new Subject();
      new BinaryObserver(subject2, true);
      System.out.println("\nFortj state change: 100");
       subject2.setState(100);
   }
}

/*
class obs {
    absract update();
}

class obsB extends A
{
    updae() {
    mute 
    }
} 

class obsC extends A
{
    updtae() {
    // write on new feeds
    }
} 


class Test
{
    ArrayList <obs>  list ; 
    
    list1[0] = new obsB(); 
    list1[0].update();
    
    list1[1] = new obsC(); 
    list1[1].update();
    
    nortify()
    {
        for (int  i= 0 ; i<list.size ' i++')
            list1[i].update(); 
    }
}
*/