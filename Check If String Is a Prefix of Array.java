class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
            
               /*     String str = String.join(" ",words);
            
            
            if(str.equals(s))
                    return true;
            return false;
            
            */
            
            //int len = s.length;
                StringBuffer sb = new StringBuffer();
      for(int i = 0; i < words.length  && sb.length() < s.length(); i++) {
               
              // if(len==1){
      
         sb.append(words[i]);
                
             
      }
      String str = sb.toString();
      
            if(str.equals(s))
                 return true;
            
            return false;
                 
            
            
    }
}