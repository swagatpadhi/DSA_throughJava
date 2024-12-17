package sorting;
import java.util.*;
public class SelectionSort {
    public static void sortSelectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int smallestValInd = i;
            for(int j = i+ 1; j < arr.length; j++) {
                //find smallest element
                if(arr[j] < arr[smallestValInd]) {
                    smallestValInd = j;
                }
            }
            //swap smallest with ith position
            int temp = arr[i];
            arr[i] = arr[smallestValInd];
            arr[smallestValInd] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sortSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
