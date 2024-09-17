class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
        HashMap<Character, Integer> map = new HashMap<>();
        
        int len = magazine.length();
        
        for(int i = 0; i < len; i++) {
            char current = magazine.charAt(i);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        
        len = ransomNote.length();
        
        for(int i = 0; i < len; i++) {
            char key = ransomNote.charAt(i);
            if(map.get(key) != null && map.get(key) > 0) {
                map.put(key, map.get(key) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}