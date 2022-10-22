class Solution {
    public int mostWordsFound(String[] sentences) {
      
             
        int[] size = new int[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            size[i] = s.length;
        }
        Arrays.sort(size);
        return size[(sentences.length)-1];
            
            /* String[] s = new String[20];
            int count =0;
            int max = 0;
            for(int i=0; i<sentences.length; i++){
                    String[] s = sentences[i].split("");
                    int len[i] = s.length();
                    count=len;
                            
                        if(len>max)
                                max = len;
                            
            }
            return max;
         */   
    }
}