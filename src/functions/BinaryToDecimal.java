package functions;

public class BinaryToDecimal {
    public static void binToDec(int bin) {
        int pow = 0;
        int dec = 0;
        while(bin > 0) {
            int extDig = bin % 10;
            dec = (int)(dec + (extDig * Math.pow(2, pow)));
            pow++;
            bin/=10;
        }
        System.out.println("so in decimal: " + dec);
    }
    public static void main(String[] args) {
        binToDec(1000);
    }
}
