class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of
        (
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int result = 0;

        for (int i = 0 ; i < s.length() - 1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);

            if (romanMap.get(currentChar) < romanMap.get(nextChar)) { // 현재값이 다음값보다 작으면 빼기
                result -= romanMap.get(currentChar);
            } else { // 현재값이 더 크면 더하기
                result += romanMap.get(currentChar);
            }
        }
        // 마지막 문자는 더하기
        result += romanMap.get(s.charAt(s.length() - 1));

        return result;
    }
}