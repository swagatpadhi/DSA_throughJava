package arrays;

public class LargestInArray {
    public static int largestInArray(int[] array) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++) {
            if(array[i]>largest) {
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 99,  4355};
        System.out.println("largest no. in the array: "+ largestInArray(array));
    }
}
