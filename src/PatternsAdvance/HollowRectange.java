package PatternsAdvance;

public class HollowRectange {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5; j++) {
                //if we are in boundary wale
                //cell, we will print * else print space.
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
