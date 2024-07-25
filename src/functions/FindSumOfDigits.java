package functions;

public class FindSumOfDigits {
    public static int findSumOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            int extDigit = num % 10;
            sum = sum + extDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(findSumOfDigits(961));
    }
}
