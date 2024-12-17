package conditionalStatements;
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scn.nextInt();

        String result = (num%2 != 0)?"odd":"even";
        System.out.println(num+" is "+result);
    }
}
