package Arrays;

public class SecondMaximumElement {
        public static int findSecondMax(int[] arr) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > max) {

                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num < max) {

                    secondMax = num;
                }
            }

            return secondMax;
        }

        public static void main(String[] args) {
            int[] nums = {12, 35, 1, 10, 34, 1};
            int result = findSecondMax(nums);

            if (result == Integer.MIN_VALUE) {
                System.out.println("Second maximum does not exist");
            } else {
                System.out.println("Second maximum element: " + result);
            }
        }
    }



