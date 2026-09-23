
    package LeetCode;

    public class Leetcode_1295 {
        public static int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                int digits = String.valueOf(num).length(); // digit count
                if (digits % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int[] nums = {12, 345, 2, 6, 7896};
            int ans = findNumbers(nums);
            System.out.println("Count of numbers with even digits: " + ans);
        }
    }



