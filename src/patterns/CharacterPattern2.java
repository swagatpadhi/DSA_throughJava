package patterns;
//A
//AB
//ABC
//ABCD
public class CharacterPattern2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            int x = 65;
            for(int j = 1; j <= i; j++) {
                char ch = (char) x;
                System.out.print(ch);
                x++;
            }
            System.out.println();
        }
    }
}
