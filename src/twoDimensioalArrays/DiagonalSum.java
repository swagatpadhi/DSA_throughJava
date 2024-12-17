package twoDimensioalArrays;

public class DiagonalSum {
    public static void forwardDiagonalSum(int[][] matrix) {
        // sum of \ diagonal
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][i];
                }
        System.out.println("sum of forward diagonal (\\) is: "+sum);
    }


    public static void backwardDiagonalSum(int[][] matrix) {
        // sum of / diagonal
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][matrix.length-1-i];
            }
        System.out.println("sum of backward diagonal (/) is: "+sum);
        }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
        };
        forwardDiagonalSum(matrix);
        backwardDiagonalSum(matrix);
    }
}
