class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1; // 배열의 마지막 인덱스

        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}