// question link : https://leetcode.com/problems/palindrome-number/description/
import java.util.*;
public class PelindromNo {
    public static boolean isPalindrome(int x) {
        int revNo = 0;
        int original = x; // Store original number
        
        if (x < 0) {
            return false; // Negative numbers cannot be palindromes
        }

        while (x > 0) {
            int temp = x % 10;
            revNo = (revNo * 10) + temp;
            x = x / 10; // Reduce x, fixing infinite loop
        }

        return revNo == original; // Compare reversed number with original
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        isPalindrome(x);
    }
}
