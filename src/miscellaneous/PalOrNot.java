package miscellaneous;

import java.util.Scanner;

public class PalOrNot {
    public static boolean palOrNot(int num) {
        int rev = 0;
        int origNum = num;
        while(num > 0) {
            rev = rev*10 + (num%10);
            num /=10;
        }

        if(origNum == rev) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(palOrNot(12242214));
    }
}
