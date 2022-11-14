//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Binary_Search g = new Binary_Search();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Binary_Search {
    int binarysearch(int arr[], int n, int k) 
    {
        // code here
        int l=0 , r=n-1;

        while(l<=r)
        {

            int mid=(l+r)/2;
            if(arr[mid]==k)
            {
                return mid;
                
            }
            else if(arr[mid]>k)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
}