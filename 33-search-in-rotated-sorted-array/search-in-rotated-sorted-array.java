class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            // 정수 오버플로우 방지
            int mid = left + (right - left) / 2;

            // 타깃을 찾으면 해당 인덱스로 반환
            if (target == nums[mid]) {
                return mid;
            }
            // 왼쪽이 정렬되었는지
            if (nums[left] <= nums[mid]) {
                // 타깃이 정렬된 왼쪽에 있는지 확인
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            // 오른쪽에 정렬되어 있는지
            } else {
                // 타깃이 정렬된 오른쪽에 있는지
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}