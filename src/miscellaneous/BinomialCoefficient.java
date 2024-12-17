package miscellaneous;

public class BinomialCoefficient {
    public static int fact(int num) {
        if(num == 1 || num == 0) {
            return 1;
        }else if(num < 0) {
            return -1;
        }else {
            int fact = 1;
            while (num > 1) {
                fact *= num;
                num--;
            }
            return fact;
        }
    }

    public static int binCoeff(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int diffnAndr_fact = fact(n-r);
        return n_fact/(r_fact*diffnAndr_fact);
    }
    public static void main(String[] args) {
//        System.out.println(fact(9));
        System.out.println(binCoeff(5, 2));
    }
}


