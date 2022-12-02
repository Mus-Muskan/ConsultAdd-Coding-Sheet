//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) 
    {
        // code here
            ArrayList<Integer>map=new ArrayList<>();

         int i=0,j=0;
         while(i<n&&j<n)
         {
            while(i<n-1&&arr[i]<0)
            i++;
            
            if(arr[i]>=0)
            map.add(arr[i++]);
              
            while(j<n-1&&arr[j]>=0)
            j++;
            
            if(arr[j]<0)
            map.add(arr[j++]);
         }
         
         for (int j2 = i; j2 < arr.length; j2++) 
            if(arr[j2]>=0)
            map.add(arr[j2]);
         
         for (int j2 = j; j2 < arr.length; j2++)
            if(arr[j2]<0)
            map.add(arr[j2]);
            
         for (int j2 = 0; j2 < arr.length; j2++)
            arr[j2]=map.get(j2);
    }
}