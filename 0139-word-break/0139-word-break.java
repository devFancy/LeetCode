import java.util.List;

public class Solution {

    int[] memorization;

    public int dp(String subWord, List<String> wordDict) {
        if (memorization[subWord.length()] != 0) {
            return memorization[subWord.length()];
        }

        String tempWord = "";
        for (int i = 0; i < subWord.length(); i++) {
            tempWord += subWord.charAt(i);
            if (wordDict.contains(tempWord)) {
                if (subWord.length() == tempWord.length()) {
                    memorization[subWord.length()] = 2;
                    return memorization[subWord.length()];
                }
                if (dp(subWord.substring(i + 1), wordDict) == 2) {
                    memorization[subWord.length()] = 2;
                    return memorization[subWord.length()];
                }
            }
        }
        memorization[subWord.length()] = 1;
        return memorization[subWord.length()];
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        memorization = new int[s.length() + 1];
        dp(s, wordDict);
        return memorization[s.length()] == 2;
    }
}