package Sorting;

import java.util.Arrays;
public class BubbleAscendingOrder {
    public static void main(String args[]) {
        int arr[] = {5, 3, 1, 6, 8, 9, 2};
        Run(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Run(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break; 
        }
    }
}
