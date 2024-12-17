package PatternsAdvance;

public class InvertedRotatedHalfPyramid {
    public static void printInvRotHalPyr(int rows, int cols) {
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j<= i-1; j++) {
                System.out.print("  ");
            }
            for(int k = 5; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvHalPyrWitNum(int rows, int cols) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= (rows-i)+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void printZeroOneTriangle(int row, int cols) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1");
                }else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        printInvRotHalPyr(5, 4);
//        printInvHalPyrWitNum(5,5);
        printZeroOneTriangle(5,5);
    }
}
