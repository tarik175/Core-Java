package leetcodepractices;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {
       int ex[]={3,2,3};
       int target=6;
        System.out.println(Arrays.toString(twoSum(ex, target)));


    }



    public static int[] twoSum(int[] nums, int target) {
        int arr[]= {0,0};
        for(int i=0;i<nums.length-1;i++){
            for (int j = i+1; j <nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }

        }
        return arr;
    }
}
