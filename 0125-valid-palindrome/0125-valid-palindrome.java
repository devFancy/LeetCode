class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;

        // 정규식으로 다른 문자 제거
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();

        // 중간값부터 비교
        int toLeft = s.length() / 2;
        int toRight = s.length() / 2;

        // 짝수면 toLeft 를 하나 빼줌
        if (s.length() % 2 == 0) {
            toLeft -= 1;
        }

        while (toLeft >= 0) {
            if (s.charAt(toLeft--) != s.charAt(toRight++)) {
                return false;
            }
        }

        return true;
    }
}