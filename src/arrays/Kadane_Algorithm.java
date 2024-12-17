package arrays;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};

        //find max subarray sum
        int max_sum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(max_sum < currSum) {
                max_sum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("so Maximum subarray sum: "+ max_sum);
    }
}
