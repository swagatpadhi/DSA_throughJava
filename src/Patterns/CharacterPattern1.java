package Patterns;
/*
A
BC
DEF
GHIJ
 */
public class CharacterPattern1 {
    public static void main(String[] args) {
        int x = 65;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                char ch = (char) x;
                System.out.print(ch);
                x++;
            }
            System.out.println();
        }
    }
}
