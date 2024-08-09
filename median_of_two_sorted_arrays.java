import java.util.Arrays;

public class median_of_two_sorted_arrays {
    public static void main(String[] args) {
        int [] num1 = {2,3};
        int [] num2 = {2};
        median_of_two_sorted_arrays m1 = new median_of_two_sorted_arrays();
       float a = (float) m1.findMedianSortedArrays(num1,num2);
        System.out.println(a);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merage = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            merage[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merage[k++] = nums2[i];
        }
        Arrays.sort(merage);
        int total = merage.length;
        if (total % 2 == 1) {
            return (double) merage[total / 2];
        } else {

            int middle1 = merage[total / 2 - 1];
            int middle2 = merage[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }

    }
}
