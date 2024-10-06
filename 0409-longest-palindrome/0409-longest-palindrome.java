class Solution {
    public int longestPalindrome(String s) {
        // 문자 빈도수를 저장할 배열
        int [] charCount = new int[128];

        // 문자열의 각 문자 빈도수 계산
        for(char c : s.toCharArray()) {
            charCount[c]++;
        }

        // return 회전문 길이
        int longestPalindromeLength = 0;
        // 홀수 여부 확인
        boolean hasOddFrequency = false;

        // 각 문자의 빈도수를 확인하여 회문 길이 계산
        for (int count: charCount) {
            if(count % 2 == 0) {
                longestPalindromeLength += count;
            }
            else {
                longestPalindromeLength += count -1;
                hasOddFrequency = true;
            }
        }

        // 홀수 개수의 문자가 하나라도 있으면 중앙에 하나를 배치함
        if (hasOddFrequency) {
            longestPalindromeLength += 1;
        }

        return longestPalindromeLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 1
        String s1 = "abccccdd";
        System.out.println("Input: " + s1 + " => Output: " + solution.longestPalindrome(s1)); // Output: 7

        // 예제 2
        String s2 = "aba";
        System.out.println("Input: " + s2 + " => Output: " + solution.longestPalindrome(s2)); // Output: 3
    }
}
