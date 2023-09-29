class Solution {
    public boolean isMonotonic(int[] arr) {
       int N = arr.length;
    boolean inc = true;
    boolean dec = true;

     for (int i = 0; i < N - 1; i++) 
      if (arr[i] > arr[i + 1]) 
        inc = false;


 
 
    for (int i = 0; i < N - 1; i++) 
 

      if (arr[i] < arr[i + 1]) 
        dec = false;
      
    
 
    // Pick one whether inc or dec
    return inc || dec;
    }
    
}