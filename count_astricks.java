class Solution {
    public int countAsterisks(String s) {
           int count=0;
            int res=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(count%2==0){
                if(c=='*')
                    res++;
                if(c=='|')
                    count++;
            }
            else if(c=='|')
               count++;
        }
        return res;
    }
}