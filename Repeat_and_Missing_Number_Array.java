public class Repeat_and_Missing_Number_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3};
        int[] result = Repat(arr);
        for (int j : result) {
            System.out.println(j);
        }
    }
    public static int[] Repat(int[] arr) {
       int[] re =new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    re[0] = arr[i];
                    int a = re[0];
                    re[1] = a + 1;
                }
            }

        }
        return re;

    }

}
