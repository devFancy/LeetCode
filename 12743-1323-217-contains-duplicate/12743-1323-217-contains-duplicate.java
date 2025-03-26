class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if (!set.add(num)) { // 이미 존재하면 add는 false -> 중복
                return true;
            }
        }
        return false;
    }
}