package functions;

import java.util.Scanner;

public class Factorial {

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
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scn.nextInt();
        System.out.println("Factorial: "+findFactorial(a));
    }
}
