package sorting;
import java.util.*;
public class BubbleSort {
    public static void sortBubble(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 2, 5};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
