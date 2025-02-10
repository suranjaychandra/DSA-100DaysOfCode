// question link : https://leetcode.com/problems/reverse-integer/description/
import java.util.*;
public class ReverseA_No {
    public static int reverse(int x) { // Changed method name from reverseNo to reverse
        int revNo = 0;

        while (x != 0) {
            int temp = x % 10;

            // Overflow check
            if (revNo > Integer.MAX_VALUE / 10 || revNo < Integer.MIN_VALUE / 10) {
                return 0; 
            }

            revNo = (revNo * 10) + temp;
            x = x / 10;
        }
        return revNo;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        System.out.println(reverse(x)); // Calling the corrected method name
    }
}
