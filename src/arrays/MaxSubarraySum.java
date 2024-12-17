package arrays;

public class MaxSubarraySum {
    public static void findMaxSubarraySum(int[] arr) {
        //using prefix sum
        int maxSum = Integer.MIN_VALUE;
        int[] prefArr = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefArr[i] = sum;
        }

        for(int start = 0; start < arr.length; start++) {
            for(int end = start; end < arr.length; end++) {
                int currSum = (start == 0? prefArr[end]: prefArr[end] - prefArr[start-1]);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        findMaxSubarraySum(arr);
    }
}
