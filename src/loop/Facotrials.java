package loop;

public class Facotrials {
    public static void main(String[] args) {
        int num = 0;
        int originalNum = num;
        int fact = 1;
        while(num >= 1) {
            fact *= num;
            num --;
        }
        System.out.println("Factorial of "+originalNum+" is: "+fact);
    }
}
