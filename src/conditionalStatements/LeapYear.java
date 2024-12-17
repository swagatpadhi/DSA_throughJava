package conditionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = scn.nextInt();

        if(year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else if(year % 100 == 0 && year % 400 == 0) {
            System.out.println("Not leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}
