public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid; // bad version이 발견되면, end를 mid로 갱신
            } else {
                start = mid + 1; // mid가 good version이면, start를 mid+1로 갱신
            }
        }
        
        return start; // 첫 번째 bad version을 반환
    }
}