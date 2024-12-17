package arrays;

public class PrefixArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

        int[] prefArr = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefArr[i] = sum;
        }

        //print prefix array
        for(int i = 0; i < prefArr.length; i++) {
            System.out.print(prefArr[i]+" ");
        }
    }
}
