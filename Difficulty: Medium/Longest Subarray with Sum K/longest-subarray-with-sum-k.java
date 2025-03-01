//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans = ob.longestSubarray(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// import java.util.*;



 class Solution {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        sumMap.put(0, -1); // Handle the case where the subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (sumMap.containsKey(cumulativeSum - k)) {
                int length = i - sumMap.get(cumulativeSum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!sumMap.containsKey(cumulativeSum)) {
                sumMap.put(cumulativeSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 7, 1, -10};
        int k1 = 15;
        System.out.println(longestSubarray(arr1, k1)); // Output: 6

        int[] arr2 = {-5, 8, -14, 2, 4, 12};
        int k2 = -5;
        System.out.println(longestSubarray(arr2, k2)); // Output: 5

        int[] arr3 = {10, -10, 20, 30};
        int k3 = 5;
        System.out.println(longestSubarray(arr3, k3)); // Output: 0
    }
}
