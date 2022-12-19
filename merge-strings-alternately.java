class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int one = 0, two = 0;
        while(one < word1.length() && two < word2.length()){
            result += word1.charAt(one);
            one++;
            result += word2.charAt(two);
            two++;
        }
        while(one < word1.length()){
            result += word1.charAt(one);
            one++;
        }
        while(two < word2.length()){
            result += word2.charAt(two);
            two++;
        }
        
        return result;
    }
}