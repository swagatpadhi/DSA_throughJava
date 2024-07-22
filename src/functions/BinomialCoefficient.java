package functions;

import java.util.Scanner;

public class BinomialCoefficient {
    public static int findFactorial(int a){
        if(a == 0 || a == 1) {
            return 1;
        }else if(a < 0){
            return -1;
        }else{
            int prod = 1;
            for(;a > 1; a--){
                prod *= a;
            }
            return prod;
        }
    }

    public static int binomialCoefficient(int n, int r){
        int n_fact = findFactorial(n);
        int r_fact = findFactorial(r);
        int nmr_fact = findFactorial(n-r);
        return n_fact/(r_fact*nmr_fact);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scn.nextInt();
        System.out.println("Enter the value of r: ");
        int r = scn.nextInt();
        System.out.println("So binomial coefficient is: "+ binomialCoefficient(n, r));
    }
}
