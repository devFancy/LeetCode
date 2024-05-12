class Solution {
    public int search(int[] nums, int target) {
        
        int mid = 0;
        
        if(nums.length >= 2) {
            mid = nums.length / 2;
        }
        else {mid = 0;}
        
        while(mid >= 0 && mid < nums.length) {
            if(nums[mid] == target) {return mid;}
            
            else if(nums[mid] > target) {
                mid--;
                if(mid < 0 || nums[mid] < target) {
                    return -1;
                }
            }
            else {
                mid++;
                if(mid >= nums.length || nums[mid] > target) {
                    return -1;
                }
            }
        }
        return -1;
    }
}