class Solution {
    public int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        int digit;
while(n > 0)  
{  
     
digit = n % 10;  
   
sum = sum + digit;  
multi = multi * digit;   
n = n / 10;  
}
        
        return multi - sum;


    }
}