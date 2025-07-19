class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // 처음 값은 유니크한 값으로 k를 1증가시킨다.
        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            // 현재의 값과 가장 마지막에 위치한 유니크한 값과 비교한다.
            if(nums[i] != nums[k-1]) {
                // 값이 다르면 nums[k] 자리에 새로운 값을 추가하고 k를 1증가시킨다.
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}