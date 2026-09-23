package Arrays;

public class Minimum {
        public static int findMin(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

        public static void main(String[] args) {
            int[] nums = {4, 7, 1, 9, 3};

            int minValue = findMin(nums);

            System.out.println("Minimum element: " + minValue);
        }
    }


