import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxGlobal = nums[0];
        int maxCurrent = nums[0];
        for(int i =1; i<nums.length; i++){
            maxCurrent = Math.max(nums[i], maxCurrent+nums[i]);
            if (maxGlobal < maxCurrent){
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

    public void main(String args[]){
        int nums1[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The subarray "+Arrays.toString(nums1)+" has the largest sum "+maxSubArray(nums1));
        int nums2[] = {1};
        System.out.println("The subarray "+Arrays.toString(nums2)+" has the largest sum "+maxSubArray(nums2));
        int nums3[] = {5,4,-1,7,8};
        System.out.println("The subarray "+Arrays.toString(nums3)+" has the largest sum "+maxSubArray(nums3));
    }
}