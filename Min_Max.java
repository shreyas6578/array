//Maximum and minimum of an array using minimum number of comparisons
public class Min_Max {
    public static void main(String[] args) {
    int [] arr = {12,25,25,2,485,12,3,1};
    int [] result = max_min(arr);
    System.out.println("min = "+result[0]+" max = "+result[1]);

    }
    public static int [] max_min(int []arr){
        int min = arr[0];
        int max = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
        min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return new int [] {min,max};
    }

}
