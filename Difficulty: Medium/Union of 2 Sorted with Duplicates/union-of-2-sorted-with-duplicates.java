//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(a, b);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// a,b : the arrays
// import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0, n = a.length, m = b.length;

        while (i < n && j < m) {
            while (i > 0 && i < n && a[i] == a[i - 1]) i++;
            while (j > 0 && j < m && b[j] == b[j - 1]) j++;
            if (i >= n || j >= m) break;

            if (a[i] < b[j]) {
                unionList.add(a[i++]);
            } else if (a[i] > b[j]) {
                unionList.add(b[j++]);
            } else {
                unionList.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) unionList.add(a[i]);
            i++;
        }

        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) unionList.add(b[j]);
            j++;
        }

        return unionList;
    }

    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5}, b1[] = {1, 2, 3, 6, 7};
        System.out.println(findUnion(a1, b1));

        int a2[] = {2, 2, 3, 4, 5}, b2[] = {1, 1, 2, 3, 4};
        System.out.println(findUnion(a2, b2));

        int a3[] = {1, 1, 1, 1, 1}, b3[] = {2, 2, 2, 2, 2};
        System.out.println(findUnion(a3, b3));
    }
}

