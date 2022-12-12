class Solution {
    public String firstPalindrome(String[] words) {
        
        StringBuilder first = new StringBuilder();
for(int i=0; i<words.length; i++){

    StringBuilder palind = new StringBuilder();
    palind.append(words[i]);
    palind.reverse();

    if(words[i].equals(palind.toString())){
        return words[i];
    }

    }
 return "";
          
    }
}