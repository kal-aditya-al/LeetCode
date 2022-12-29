class Solution {
    public int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        
        int len = res.length;
         
        String a = res[len-1];
        return a.length();
    }
}