class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int si = 0;
        int end = n-1;
        while(si <= end){
            int mid = (si+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid -1;
            }
            else{
                si = mid+1;
            }
        }
        return si;
    }
}