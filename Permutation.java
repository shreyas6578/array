import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permuation(arr,0);

    }
    private static void permuation(int[] arr, int start) {
        if (start == arr.length-1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr,start,i);
            permuation(arr,start+1);
            swap(arr,start,i);
        }
    }
    public static void swap(int[] arr, int start, int i) {
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
    }

}