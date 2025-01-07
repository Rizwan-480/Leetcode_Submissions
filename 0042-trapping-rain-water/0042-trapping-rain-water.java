import java.util.*;
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        // Calculating Leftmax:
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        // Calculating Rightmax:
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        // Calculating Trapped Rainwater:
        for(int i = 0; i < n; i++){
            water += Math.min(leftmax[i], rightmax[i]) - height[i];
        }
        return water;
    }

    public void main(String args[]){
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height1));
        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2));
    }
}