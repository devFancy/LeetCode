class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            // 타깃을 찾으면 해당 인덱스로 반환
            if (nums[mid] == target) {
                return true;
            }

            // [Key Point] 모호한 경우를 처리하는 로직 추가
            if (nums[left] == nums[mid]) {
                left++; // 판단이 불가능하므로 left를 한 칸 옮겨서 범위를 축소
                continue; // 다음 루프로 넘어감
            }

            // 왼쪽 정렬
            if (nums[left] < nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else { 
                    left = mid + 1;
                }
            // 오른쪽 정렬
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else { 
                    right = mid - 1;
                }
            }

        }
        // 타깃이 존재하지 않으면 false 반환
        return false;
    }
}