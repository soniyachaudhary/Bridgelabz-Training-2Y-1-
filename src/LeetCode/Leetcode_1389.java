package LeetCode;

import java.util.*;

public class Leetcode_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]); // insert at given position
        }

        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] target = createTargetArray(nums, index);

        System.out.println("Target Array: " + Arrays.toString(target));
    }
}
