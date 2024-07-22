package functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter 2 no.s: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        findProduct(a, b);
    }

    private static void findProduct(int a, int b) {
        System.out.println("product is: " + a*b);
    }
}
