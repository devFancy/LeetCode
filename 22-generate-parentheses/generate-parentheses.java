class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);
        return result;
    }

    /**
     * 백트래킹을 사용하여 괄호 조합을 생성하는 재귀 함수
     *
     * @param result      결과를 저장할 리스트
     * @param currentStr  현재까지 만들어진 괄호 문자열
     * @param openCount   사용한 열린 괄호 '('의 개수
     * @param closeCount  사용한 닫힌 괄호 ')'의 개수
     * @param n           주어진 괄호 쌍의 수
     */
    private void backtrack(List<String> result, String currentStr, int openCount, int closeCount, int n) {

        // 현재 문자열의 길이가 n * 2 와 같으면 결과를 추가하고 종료
        if (currentStr.length() == n * 2) {
            result.add(currentStr);
            return;
        }

        // 사용할 수 있는 열린 괄호가 남아있는 경우
        if (openCount < n) {
            backtrack(result, currentStr + "(", openCount + 1, closeCount, n);
        }

        // 닫힌 괄호의 수가 열린 괄호의 수보다 적은 경우
        if (closeCount < openCount) {
            backtrack(result, currentStr + ")", openCount, closeCount + 1, n);
        }
    }
}