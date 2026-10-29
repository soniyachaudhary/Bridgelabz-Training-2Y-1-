package Recursion;

public class LinearSearch {
    public static int search(int arr[],int index,int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, index + 1, target);
    }
        public static void main(String[] args) {
            int arr[] = {5, 12, 7, 25, 9, 30, 18};
            int target = 25;
            int result = search(arr, 0, target);
            System.out.println("Index of " + target + " = " + result);
        }
    }

