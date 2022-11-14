//{ Driver Code Starts
    import java.util.*;

    class SelectionSort
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n]; 
                for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                }
            
                Solution obj = new Solution();
                obj.SelectionSort(arr, n);
                
                for(int i=0;i<n;i++)
                    System.out.print(arr[i]+" ");
                System.out.println();
                t--;
            }
            
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution
    {
        int  select(int arr[], int i)
        {
            // code here such that selectionSort() sorts arr[]
             for(i=0;i<arr.length;i++){
                // System.out.print();
            // return ;
            }
                return arr[i];
        }
        
        void SelectionSort(int arr[], int n)
        {
            for (int i = 0; i < n - 1; i++) {
                int min = Integer.MAX_VALUE;
                int minIndex = -21;
                for (int j = i; j < n; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
        }
    }
    }
    