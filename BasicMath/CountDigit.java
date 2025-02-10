// Question link : https://www.geeksforgeeks.org/problems/count-digits5716/1

import java.util.*;
public class CountDigit {
      static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int temp = n;
       while(temp > 0)
       {
          int digit = temp % 10;
          
          if( digit != 0 && n % digit == 0)
          {
              count ++;
          }
          
          temp = temp / 10;
       }
       
       return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int result = evenlyDivides(n);
        
        System.out.println(result);
    }
}
