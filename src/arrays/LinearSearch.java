package arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchString(String[] arr, String key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] marks = {2, 4, 6, 8, 10, 12, 14, 16};
        String[] menu = {"chips", "roll", "samosa", "momos", "vada"};
        int key = 10;
        String item = "roll";
        System.out.println(linearSearch(marks, key));
        System.out.println(linearSearchString(menu, item));
    }
}
