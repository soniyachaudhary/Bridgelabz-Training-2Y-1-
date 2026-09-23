package Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int size = 3;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        for (int i = 1; i <= arr.length - size; i++) {
            sum = sum - arr[i - 1] + arr[i + size - 1];
            System.out.println(sum);
        }
    }
}
