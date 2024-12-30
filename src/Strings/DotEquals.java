package Strings;

public class DotEquals {
    public static void main(String[] args) {
        String s1 = "Swagat";
        String s2 = "Swagat";
        String s3 = new String("Swagat");
        System.out.println(s1==s2?"true":"false");
        System.out.println(s1 == s3?"true":"false");
        System.out.println(s1.equals(s3)?"true":"false");
    }
}
