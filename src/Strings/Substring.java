package Strings;
import java.util.*;

public class Substring {
    public static void printSubstring(String str, int si, int ei) {
        String subStr = "";
        while(si < ei) {
            subStr += str.charAt(si);
            si++;
        }
        System.out.println("required substring:"+subStr);
    }
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSubstring(str, 0, 4);
    }
}
