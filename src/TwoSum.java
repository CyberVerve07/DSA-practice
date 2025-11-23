// File: Day01/TwoSum.java
// Day01: Two Sum problem - HashMap O(n) solution

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Returns indices of two numbers that add up to target.
     * Uses a single-pass HashMap for O(n) time.
     *
     * @param nums input array
     * @param target target sum
     * @return int[2] with indices, or null if none (problem guarantees one solution)
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            // store current value -> index
            seen.put(nums[i], i);
        }
        // According to problem constraints this won't happen, but return null defensively
        return null;
    }

    // Simple test runner — add more tests if you want
    public static void main(String[] args) {
        runTest(new int[]{2,7,11,15}, 9, new int[]{0,1});
        runTest(new int[]{3,2,4}, 6, new int[]{1,2});
        runTest(new int[]{3,3}, 6, new int[]{0,1});
        runTest(new int[]{-1,-2,-3,-4,-5}, -8, new int[]{2,4}); // -3 + -5 = -8
        System.out.println("If all assertions passed, solution OK.");
    }

    private static void runTest(int[] nums, int target, int[] expected) {
        int[] res = twoSum(nums, target);
        if (res == null) {
            throw new AssertionError("Expected indices but got null. nums=" + Arrays.toString(nums));
        }
        // Order of indices may differ; check values add up and indices valid
        if (nums[res[0]] + nums[res[1]] != target) {
            throw new AssertionError("Wrong pair returned. nums=" + Arrays.toString(nums) +
                    " target=" + target + " got indices=" + Arrays.toString(res));
        }
        // quick sanity: expected indices' values must match
        if (!(nums[expected[0]] + nums[expected[1]] == target)) {
            // don't fail here; expected might be one possible pair, so only check sum
        }
        System.out.println("PASS: " + Arrays.toString(nums) + " target=" + target +
                " -> indices=" + Arrays.toString(res));
    }
}
