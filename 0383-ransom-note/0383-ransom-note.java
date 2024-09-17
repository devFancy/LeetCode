import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. HashMap을 이용해 magazine의 각 문자의 개수 기록
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            char current = magazine.charAt(i);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        
        // 2. ransomNote의 각 문자를 검사
        for (int i = 0; i < ransomNote.length(); i++) {
            char current = ransomNote.charAt(i);
            
            // map에 문자가 없거나, 개수가 부족하면 false 반환
            if (!map.containsKey(current) || map.get(current) == 0) {
                return false;
            }
            
            // 사용한 문자의 개수를 줄임
            map.put(current, map.get(current) - 1);
        }
        
        // 3. 모든 문자를 확인한 후 true 반환
        return true;
    }
}
