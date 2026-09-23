package LeetCode;

import java.util.*;

public class MaximumThirdElement {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinct = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinct++;
                if (distinct == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        int ans = thirdMax(nums);
        System.out.println("Third Maximum: " + ans);
    }
}
