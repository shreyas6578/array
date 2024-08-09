//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
import java.util.*;
public class Duplicate_Integer {
    public static void main(String [] args){
    int [] nums ={1,2,3,4,5,5};
        Duplicate_Integer solution = new Duplicate_Integer();
        boolean result = solution.hasDuplicate(nums);
        System.out.println(result);

    }
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }


    }


