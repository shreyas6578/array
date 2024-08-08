//reverse given array
public class reverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("original array is: ");
        for(int a:arr){
            System.out.print(a);
        }
        int [] result = Reverse(arr);
        System.out.println("reverse array is ");
        for(int a:result){
            System.out.print(a);
        }

    }
    public static int [] Reverse(int [] arr){
        int start = 0;
        int end =arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return  arr;
    }
}




