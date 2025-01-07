class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public void main(String args[]){
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        System.out.println(target+" exist in nums and its index is: "+search(nums, target));
    }
}