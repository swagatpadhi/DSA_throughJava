import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        System.out.println("A quadratic equation is defined as ax^2 + bx + c = 0");

        Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("enter the value of a: ");
        a = scn.nextInt();
        int b;
        System.out.println("enter the value of b: ");
        b = scn.nextInt();
        int c;
        System.out.println("enter the value of c: ");
        c = scn.nextInt();

        double disc = Math.pow(b,2) - 4*a*c;
        if(disc >= 0) {
            System.out.println("equation has real roots");
        }else {
            System.out.println("equation has no real roots");
        }
    }
}
