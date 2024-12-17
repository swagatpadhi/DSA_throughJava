package twoDimensioalArrays;
import java.util.*;

public class FindLargestElement {
    public static void findSmallestValue(int[][] array) {
        int minimumVal = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] < minimumVal) {
                    minimumVal = array[i][j];
                }
            }
        }
        System.out.println("Smallest value in the matrix = "+minimumVal);
    }
    public static void findLargestElement(int[][] array) {
        int maximumVal = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] > maximumVal) {
                    maximumVal = array[i][j];
                }
            }
        }
        System.out.println("Largest value in the matrix = "+maximumVal);
    }
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scn = new Scanner(System.in);
        System.out.println("Please make the matrix (3x3): ");

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        //printing the array
        System.out.println("Your array is: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        findLargestElement(array);
        findSmallestValue(array);

    }
}
