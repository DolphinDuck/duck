/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestnumberarray;

import java.util.Arrays;

/**
 *
 * @author abkar
 */
public class SmallestNumberArray {

    // Function to return K'th smallest
    // element in a given array
    public static int kthSmallest(Integer[] arr, int K)
    {
        // Sort the given array
        Arrays.sort(arr);
  
        // Return K'th element in
        // the sorted array
        return arr[K - 1];
    }
  
    // driver's code
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int K = 2;
  
        // Function call
        System.out.print("K'th smallest element is "
                         + kthSmallest(arr, K));
    }
    
}
