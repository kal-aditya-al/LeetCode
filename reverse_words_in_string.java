class Solution {
    public String reverseWords(String s) {
        StringBuilder first = new StringBuilder();
        String[] strsplit = s.split(" ");

        for(String words:strsplit){
            StringBuilder second = new StringBuilder();
            second.append(words);
            second.reverse();

            first.append(second.toString() + " ");
        }
        first.setLength(first.length()-1);
        return first.toString();



    }
}