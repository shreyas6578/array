import java.util.*;

public class two_sum_hashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];  // Fix complement calculation

            if (map.containsKey(comp)) {
                list.add(map.get(comp));  // Add the index of the complement
                list.add(i);              // Add the current index
                break;                    // Exit the loop once the solution is found
            }

            map.put(nums[i], i);
        }

        System.out.println("Indices: " + list);
    }
}
