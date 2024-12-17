package miscellaneous;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = scn.nextInt();

        while(num > 0){
            int ext = num % 10;
            System.out.print(ext);
            num/=10;
        }
    }
}
