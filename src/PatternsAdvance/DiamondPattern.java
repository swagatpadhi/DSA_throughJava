package PatternsAdvance;

public class DiamondPattern {
    public static void diamondPrint(){
        //1st half
        for(int i = 1; i <= 4; i++) {
            //spaces
            for(int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int k = 1; k <= 2*(i-1)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i = 4; i >= 1; i--) {
            //spaces
            for(int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int k = 1; k <= 2*(i-1)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPrint();
    }
}
