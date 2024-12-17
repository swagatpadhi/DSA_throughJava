package loop;
import java.util.*;

public class TillMultipleOf10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inp;
        do{
            System.out.println("Please enter a no: ");
            inp = scn.nextInt();
        }while(inp % 10 != 0);
    }
}
