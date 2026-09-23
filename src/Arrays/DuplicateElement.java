package Arrays;

public class DuplicateElement {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 2, 4, 1};

            System.out.println("Duplicate elements:");
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        System.out.println(nums[i]);
                    }
                }
            }
        }
    }


