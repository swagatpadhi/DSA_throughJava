package functions;

import java.util.Scanner;

public class PrimeNumber {
    //this is an optimized code for checking prime numbers.
    public static boolean checkPrime(int a){
        if(a == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scn.nextInt();
        System.out.println(checkPrime(a));
    }
}
