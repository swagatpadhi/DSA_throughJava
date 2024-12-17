package sorting;
import java.util.*;

public class InsertionSort {
    public static void sortInsertion(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int copy = arr[i];
            int j;
            for(j = i-1; j >= 0; j--) {
                if(copy < arr[j]) {
                    //shift towards right by 1 place
                    arr[j+1] = arr[j];
                }
            }
            //insert at correct place
            arr[j+1] = copy;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 7, 4, 8, 2, 11};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
