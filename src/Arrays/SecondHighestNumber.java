package Arrays;

public class SecondHighestNumber {
        public static int findSecondHighest(int[] arr) {
            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > highest) {
                    secondHighest = highest;
                    highest = num;
                } else if (num > secondHighest && num != highest) {
                    secondHighest = num;
                }
            }

            return secondHighest;
        }

        public static void main(String[] args) {
            int[] nums = {10, 20, 4, 45, 99};

            int result = findSecondHighest(nums);

            System.out.println("Second highest element: " + result);
        }
    }

