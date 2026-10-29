package Recursion;

public class MaxNumber {
        public static int Max(int arr[], int index) {
            if (index == arr.length - 1) {
                return arr[index];
            }
            int maxInRest = Max(arr, index + 1);
            return Math.max(arr[index], maxInRest);
        }

        public static void main(String[] args) {
            int arr[] = {5, 12, 7, 25, 9, 30, 18};
            System.out.println("Maximum = " + Max(arr, 0));
        }
    }

