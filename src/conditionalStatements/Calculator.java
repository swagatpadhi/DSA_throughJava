package conditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your 1st operand: ");
        int a = scn.nextInt();
        System.out.println("Enter your 2nd operand: ");
        int b = scn.nextInt();
        System.out.println("Enter your character: ");
        char ch = scn.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Please enter only among" +
                        "%, /, *, +, -");
        }
    }
}
