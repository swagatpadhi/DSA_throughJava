package functions;

public class DecimalToBinary {
    public static void decToBin(int dec) {
        int rem;
        int bin = 0;
        int pow = 0;
       while(dec != 0) {
           rem = dec % 2;
           bin = bin + rem*((int)(Math.pow(10, pow)));
           pow++;
           dec = dec/2;
       }
        System.out.println("required binary number is: " + bin);
    }
    public static void main(String[] args) {
        decToBin(8);
    }
}

