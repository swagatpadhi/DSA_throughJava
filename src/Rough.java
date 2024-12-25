public class Rough {
    public static boolean isPalindrome(String x) {
        int s = 0;
        int e = x.length()-1;
        while(s <= e) {
            if(x.charAt(s) != x.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "racecar";
        System.out.println(isPalindrome(a));
    }
}
