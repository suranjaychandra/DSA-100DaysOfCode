// question link : https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1
import java.util.*;
import java.util.Scanner;

public class Main {
         public static void main(String args[]) {
        // Your Code Here
          // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer n
        int n = scanner.nextInt();
        
        // Print numbers from (n * 10) down to n
        for (int i = n * 10; i >= n; i-=n) {
            System.out.print(i + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
