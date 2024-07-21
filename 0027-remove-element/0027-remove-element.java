class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == val) break;
        }
        int j = i;
        for (; j < nums.length; j++) {
            if (nums[j] != val) nums[i++] = nums[j];
        }
        return i;
    }
}