package miscellaneous;

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int bin = 1011;
        int originalBin= bin;
        int dec = 0;
        for(int i = 0; bin > 0; i++) {
            dec += (bin%10)*((int)Math.pow(2, i));
            bin /= 10;
        }

        System.out.println(originalBin+" in decimal is "+dec);
    }
}
