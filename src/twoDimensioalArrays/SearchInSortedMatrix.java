package twoDimensioalArrays;

public class SearchInSortedMatrix {
    //staircase search
    public static void searchInSortedMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        int numOfRows = matrix.length;
        while( i < numOfRows && j >= 0) {
            if(matrix[i][j] == target) {
                System.out.println("key found @: "+i+","+j);
                return;
            }
            else if(target < matrix[i][j]) {
                //we'll go left
                j--;
            }
            else if(target > matrix[i][j]) {
                //we'll go down
                i++;
            }
        }
        System.out.println("key not present");
    }
    public static void main(String[] args) {
        int[][] array = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}};
        searchInSortedMatrix(array, 99);
    }
}
