package functions;
import java.util.*;

public class PrimesInRange {
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

    public static void printPrimesInRange(int end) {
        for(int i = 2; i <= end; i++) {
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the end of the range(2-end): ");
        int end = scn.nextInt();
        printPrimesInRange(end);
    }
}
