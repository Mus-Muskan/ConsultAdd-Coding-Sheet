//{ Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code End56m 31ss


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        boolean flag= false;
        int curr_sum=0;
        long max=Long.MIN_VALUE;
        //int curr=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                flag=true;

                max=Math.max(arr[i],max);
            }
            else{
                flag=false;
                break;
            }
        }

        if(flag==true)
            return max;
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];
            if(curr_sum<0)
                curr_sum=0;
            max=Math.max(curr_sum,max);
        }

        return max;
        
    }
    
}

