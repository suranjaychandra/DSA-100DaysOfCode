//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }
            Solution obj = new Solution();
            int res = obj.largest(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

// import java.util.*;


// import java.util.Scanner;


class Solution {
    public static int largest(int[] arr) {
        // code here
        int largvalue = arr[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
           if(arr[i] > largvalue)
           {
               largvalue = arr[i];
           }
        }
        return largvalue;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
         int n = sc.nextInt();
         
         int [] arr = new int[n];
           for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int maxelement = largest(arr);
         System.out.print(maxelement);
         sc.close();
    }
}
