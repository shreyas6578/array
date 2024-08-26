public class push_zero_to_start {
    public static void main(String[] args) {
        int[] arr ={1,0,2,3,0,4,0,7,8,9};
        int [] arry = new int[arr.length];
        int count = 0;
        for (int k : arr) {
            if (k == 0) {
                arry[count] = k;
                count++;
            }
        }
        for (int j : arr) {
            if (j != 0) {
                arry[count] = j;
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arry[i]+" ");
        }
    }
}
