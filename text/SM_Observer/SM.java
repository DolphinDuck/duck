/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sm;

/**
 *
 * @author abusharh
 */
public class SM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           MainAccount mainAccount = new MainAccount();   
        
        NormalFriend William = new NormalFriend(mainAccount, "William");
        NormalFriend Tania = new NormalFriend(mainAccount, "Tania");
        
        RestrictedFriend Hani = new RestrictedFriend(mainAccount, "Hani");
        RestrictedFriend Olive = new RestrictedFriend(mainAccount, "Olive");
        
        mainAccount.HandleRequests();
        
        mainAccount.PrintAllFriends();
        
        mainAccount.PrintRestricedFriends();
        
        mainAccount.StatusChangeAll("New Status 1");
      //  mainAccount.deleteFriend(William);
        
      //  mainAccount.printAllFriends(); 
      //  subject.notifyObservers();

   
    }
    
}
