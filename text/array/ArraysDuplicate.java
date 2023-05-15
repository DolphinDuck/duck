/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysduplicate;

//For details, look at: https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/

public class ArraysDuplicate {

    static void PrintDuplicate(int numRay[], int n)
    {
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                = numRay[numRay[i] % numRay.length]
                  + numRay.length;
        }
        
        System.out.println("The duplicate elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
  
        PrintDuplicate(arr, arr.length);
        
        System.out.println();
        
        int arr2[] = { 1, 2, 3, 6, 3, 6, 1 };
  
        PrintDuplicate(arr2, arr2.length);
        
    }
    
}
