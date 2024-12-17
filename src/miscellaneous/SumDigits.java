package miscellaneous;

import java.util.*;
public class SumDigits {
    public static int findSum(int num) {
        num = Math.abs(num); //to handle negative numbers
        int sum = 0;
        while(num > 0) {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("so sum is: " + findSum(344711));
    }
}
