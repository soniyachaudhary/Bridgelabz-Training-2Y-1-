package Arrays;

public class maximum {
        public static int findMax(int[] arr) {
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] nums = {3, 7, 2, 9, 5};

            int maxValue = findMax(nums);

            System.out.println("Maximum element: " + maxValue);
        }
    }


