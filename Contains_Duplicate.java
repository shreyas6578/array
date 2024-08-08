public class Contains_Duplicate {
    public static void main(String[] args) {
        int [] nums ={1,2,1,5,6,4};
        boolean result = containsDuplicate(nums) ;
        System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
