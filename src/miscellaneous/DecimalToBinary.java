package miscellaneous;

public class DecimalToBinary {
    public static int decToBin(int dec){
        int bin = 0;
        for(int i = 0; dec > 0; i++) {
            bin += (dec % 2) * (int)(Math.pow(10, i));
            dec /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(decToBin(5));
    }
}
