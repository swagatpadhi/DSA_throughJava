package loop;

import java.util.Scanner;

public class ExceptMultipleOf10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        do{
            System.out.print("enter a no: ");
            n = scn.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
