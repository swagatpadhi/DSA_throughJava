package conditionalStatements;

public class PrintLargestOf3 {
    public static void main(String[] args) {
        int a = 111;
        int b = 30;
        int c = 6;
        if(a > b && a > c){
            System.out.println(a+"is greater than"+b+","+c);
        }
        else if(b > c) {
            System.out.println(b+"is greater than "+a+","+c);
        }
        else{
            System.out.println(c+"is greater than"+b+","+a);
        }
    }
}
