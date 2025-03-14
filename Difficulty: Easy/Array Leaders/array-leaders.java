//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().leaders(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();    // Ensure new line after each test case output
                System.out.println("~"); // Ensure new line after each test case output
            }
        }
    }
}

// } Driver Code Ends





class Solution {
    public static List<Integer> leaders(int arr[]) {
        int n = arr.length;
        int right = arr[n - 1];
        List<Integer> result = new ArrayList<>();

        result.add(right);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= right) {
                result.add(arr[i]);
                right = arr[i];
            }
        }

        // Reverse the list to maintain original order
        List<Integer> finalResult = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            finalResult.add(result.get(i));
        }

        return finalResult;
    }

    public static void main(String args[]) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        List<Integer> leadersList = leaders(arr);
        System.out.println(leadersList);
    }
}


