package leet_Code;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {



    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
    Input: nums = [3,2,4], target = 6
Output: [1,2]
     */
        int[] nums = {3, 2, 4, 9}; //1 ;2 i 1 j nums [0]
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i =0 ; i<nums.length ; i++){
            for(int j=i+1 ; j< nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int [] {i,j};

                }
            }

        }
        return nums;
    }
}