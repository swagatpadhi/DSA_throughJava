package miscellaneous;

public class BlockScope {
    public static void main(String[] args) {
        int x = 3;
        {
            int s = 45;
            System.out.println(s);
            System.out.println(x);
        }
        System.out.println(x);
    }
}
