/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayscountpairgivensum;

import java.util.Arrays;

/**
 *
 * @author abkar
 */
public class ArraysCountPairGivenSum {

    
 
   //naive 
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0; // Initialize result
 
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.printf("Count of pairs is %d", count);
    }
    
    public static void main(String args[])
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        //naive
        getPairsCount(arr, sum);
        
        //better
        int[] arr2 = { 1, 5, 7, -1, 5 };
        int n = arr.length;
        int k = 6;

        // Function call
        System.out.println("Count of pairs is "
                           + getPairsCount2(arr2, n, k));
    }
    
    
    //better 
    // lowerBound implementation
    /*
    The lower_bound() method in is used to return an iterator pointing to the first element in the range [first, last) 
    which has a value not less than val. This means that the function returns an iterator pointing to the next smallest number just greater 
    than or equal to that number. If there are multiple values that are equal to val, lower_bound() returns the iterator of the first such value.
    */
  public static int lowerBound(int[] arr, int start,
                               int end, int key)
  {
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < key) {
        start = mid + 1;
      }
      else {
        end = mid;
      }
    }
    return start;
  }
 
  // upperBound implementation
  public static int upperBound(int[] arr, int start,
                               int end, int key)
  {
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] <= key) {
        start = mid + 1;
      }
      else {
        end = mid;
      }
    }
    return start;
  }
 
  // Function to find the count of pairs
  public static int getPairsCount2(int[] arr, int n, int k)
  {
    Arrays.sort(arr);
    int c = 0;
    for (int i = 0; i < n - 1; i++) {
      int x = k - arr[i];
      int y = lowerBound(arr, i + 1, n, x);
      int z = upperBound(arr, i + 1, n, x);
      c = c + z - y;
    }
    return c;
  }
 
    
    
}


/*
Given arr[] = {1, 5, 7, -1}, sum = 6

Array after sorting: arr[] = {-1, 1, 5, 7}
count = 0

At index = 0: val = sum – arr[0] = 6 – (-1) = 7
count = count + upperBound(1, 3, 7) – lowerBound(1, 3, 7)
count = 1

At index = 1: val = sum – arr[1] = 6 – 1 = 5
count = count + upperBound(2, 3, 5) – lowerBound(2, 3, 5)
count = 2

At index = 2: val = sum – arr[2] = 6 – 5 = 1
count = count + upperBound(3, 3, 1) – lowerBound(3, 3, 1)
count = 2

Number of pairs = 2
*/
