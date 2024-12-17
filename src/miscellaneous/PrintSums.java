package miscellaneous;

import java.util.*;
    public class PrintSums {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int inp = 0;
            int choice = 1;
            int evenSum = 0, oddSum = 0;
            while(choice != 0){
                System.out.print("enter number:");
                inp = scn.nextInt();
                if(inp % 2 == 0) {
                    evenSum += inp;
                }else{
                    oddSum += inp;
                }
                System.out.println("press 1 to continue, else press 0");
                choice = scn.nextInt();
            }

            System.out.println("so sum of all even numbers: "+evenSum);
            System.out.println("and sum of all odd numbers: " + oddSum);
        }
    }

