//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minStep(n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int minStep(int n)
    {
        // code here
        int count=0;
        if(n==0)
        {
            return -1;
        }
      
 while(n>1)
 
 {
     
     if(n%3==0)
     {
         n=n/3;
         count++;
     }
     else
     {
         n=n-1;
         count++;
     }
     
 }
        return count;
        
    }
}
