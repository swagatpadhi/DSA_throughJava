package loop;
import java.util.*;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scn.nextInt();
        boolean isPrime = true;
        if(num <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        else if(num == 2) {
            System.out.println("2 is a prime number");
            return;
        }
        else{
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime == true) {
            System.out.println("prime");
        }else {
            System.out.println("composite");
        }
    }
}
