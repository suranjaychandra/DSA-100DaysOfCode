//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution {
    // Optimized recursive function to calculate sum of cubes of numbers from 1 to N
    public static int sumOfSeries(int n) {
        // Base case: when n is 0, return 0
        if (n == 0)
            return 0;
        
        // Recursive call and add the cube of n to the sum
        return (n * n * n) + sumOfSeries(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Take input for n
        System.out.println(sumOfSeries(n)); // Print the sum of cubes from 1 to n
        
        sc.close();
    }
}
