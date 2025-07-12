package otherFolder.test;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 6, 6};
        int target3 = 20;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("target not found po!!!");
    }
}