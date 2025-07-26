class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), candidates, target, 0);

        return resultList;
    }

    /**
    * 백트래킹을 통해 조합을 찾는 재귀 함수
    * @param resultList 최종 결과를 담을 전체 리스트
    * @param tempList 현재까지 만들어진 조합을 임시로 담는 리스트
    * @param candidates 후보 숫자 배열
    * @param remain 남은 목표 합계 (target)
    * @param start 탐색을 시작할 후보 배열의 인덱스
    */
    private void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] candidates, int remain, int start) {
        // [실패 조건] 남은 목표 합계가 0보다 작으면, 이 경로는 더 이상 유효하지 않음
        if (remain < 0) {
            return;
        }

        // [성공 조건] 남은 목표 합계가 정확히 0이면, 유효한 조합을 찾은 것임
        if (remain == 0) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        // [재귀 호출] 현재 인덱스(start) 부터 후보 배열을 순회하며 조합을 만들어나간다.
        for (int i = start; i < candidates.length; i++) {
            
            // 선택 - 현재 후보를 임시 리스트에 추가
            tempList.add(candidates[i]);
        
            // 탐색 - 재귀 호출
            backtrack(resultList, tempList, candidates, remain - candidates[i], i);

            // 선택 취소 - 재귀 호출이 끝나면, 방금 추가했던 후보를 제거 -> 다음 반복문에서 다른 후보를 선택하여 새로운 후보를 만들 수 있음
            tempList.remove(tempList.size() - 1);
        
        }
    }
}