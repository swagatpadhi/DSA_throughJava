package miscellaneous;

public class A {
    public static boolean isPrime(int a){

        for(int i = 2; i <= a-1; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(12));
    }
}
