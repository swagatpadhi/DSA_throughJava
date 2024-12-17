package miscellaneous;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scn.nextInt();

        if(num == 2){
            System.out.println("prime");
        }else {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Composite");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
