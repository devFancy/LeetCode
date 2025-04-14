class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftValue = nums[left] * nums[left];
            int rightValue = nums[right] * nums[right];

            if (leftValue > rightValue) {
                result[pos--] = leftValue;
                left++;
            } else { 
                result[pos--] = rightValue;
                right--;
            }
        }
        return result;
    }
}