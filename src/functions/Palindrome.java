package functions;

public class Palindrome {
    public static boolean palindromeCheck(int num) {
        if(num == reverseTheNumber(num)) {
            return true;
        }else {
            return false;
        }
    }

    public static int reverseTheNumber(int a) {
        int rev = 0;
        while(a != 0) {
            int ext = a % 10;
            rev = (rev*10)+ ext;
            a /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(palindromeCheck(12321));
        System.out.println(palindromeCheck(342));
        System.out.println(palindromeCheck(121));
    }
}
