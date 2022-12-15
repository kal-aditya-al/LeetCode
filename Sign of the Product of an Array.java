class Solution {
    public int arraySign(int[] nums) {
        
        int product = 1, countp = 0, countn = 0;
       
        for(int num: nums)
        {
            if(num == 0)
                return 0;
            if(num > 0)
                countp +=1;
            if(num < 0)
                countn += 1;
        }
       
        if(countn % 2 == 0)
            return 1;
        else if(countn % 2 != 0)
            return -1;
       return 0;
    }
}