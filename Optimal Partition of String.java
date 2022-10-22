class Solution {
    public int partitionString(String s) {
        
               HashSet<Character> set = new HashSet<>();
    
    int p = 1;
    
    for(int i = 0;i<s.length();i++){
             
        
        if(set.contains(s.charAt(i))){ 
            p++; 
                
        set = new HashSet<>();            
          }
             set.add(s.charAt(i));
        
        
    }
    return p;
}
}
            
            
    
