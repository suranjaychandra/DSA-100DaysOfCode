//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int largest  = arr[0];
        int second = -1 ; 
        
       for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest; // Update second largest before changing largest
                largest = arr[i];
            } else if (arr[i] > second && arr[i] < largest) {
                second = arr[i]; // Update second largest if it's smaller than largest
            }
        }

        return second;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int []arr = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(getSecondLargest(arr));
        sc.close();
        
    }
}