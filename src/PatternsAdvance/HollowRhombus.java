package PatternsAdvance;

public class HollowRhombus {
    public static void hollowRhombus() {
        for(int i = 1; i <= 5; i++){
            //spaces
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            //code for hollow rectangle
                for(int j = 1; j <= 5; j++) {
                    //if we are in boundary wale
                    //cell, we will print * else print space.
                    if(i==1 || i==5 || j==1 || j==5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombus();
    }
}
