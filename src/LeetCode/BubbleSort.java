package LeetCode;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums.length-1;i++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
