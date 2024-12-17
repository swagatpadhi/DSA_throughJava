package arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int midInd;
        while (start <= end) {
            midInd = (start + end) / 2;
            if (target > arr[midInd]) {
                start = midInd + 1;
            } else if (target < arr[midInd]) {
                end = midInd - 1;
            } else {
                return midInd;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 104;
        System.out.println(binarySearch(arr, target));
    }
}
