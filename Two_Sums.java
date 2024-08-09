public class Two_Sums {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 6};
        int target = 9;

        // Create an instance of Two_Sums
        Two_Sums twoSums = new Two_Sums();

        // Call the twoSum method and store the result
        int[] result = twoSums.twoSum(nums, target);

        // Print the result
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            // Correctly increment j in the inner loop
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return the indices of the two numbers
                }
            }
        }

        return new int[0]; // Return an empty array if no solution is found
    }
}
