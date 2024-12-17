package miscellaneous;

import java.util.*;
public class RangePrimes {
    public static boolean isPrime(int inp) {
        if(inp == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(inp); i++) {
            if(inp % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimesInRange(int num) {
        for(int i = 2; i <= num; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scn.nextInt();
        printPrimesInRange(num);
    }
}
