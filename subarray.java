// Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum
public class subarray {
    public static void main(String[] args) {
        int arr [] = {-1,-2,3,4,5,6};
        int result = Subarray(arr);
        System.out.println(result);
    }
    public static int Subarray(int [] arr){
        int current=arr[0];
        int sum = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if (current + arr[i] < arr[i]){
                    current = arr[i];
            }
            else{
                sum = sum + arr[i];
            }
            if (current > sum){
                sum = current;
            }
        }
        return sum;
    }
}
