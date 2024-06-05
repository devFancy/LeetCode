class Solution {
    public int longestPalindrome(String s) {
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        boolean odd = false;
        for (String str : s.split("")) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        for (String str : hm.keySet()) {
            if (hm.get(str) % 2 == 0) {
                answer += hm.get(str);
            } else {
                if (odd == true) {
                    if(hm.get(str) > 1) answer += hm.get(str) - 1;
                } else {
                    answer += hm.get(str);
                    odd = true;
                }
            }
        }
        return answer;
    }
}