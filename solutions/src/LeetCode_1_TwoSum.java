import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {5, 10, 20, 12};
        int target = 15;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(target - nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = hashMap.get(target - nums[i]);
                return result;
            }
        }
        return null;
    }
}
