class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0, calculate=0;
        for(int i=0;i<accounts.length;i++){
            calculate=0;
            for(int j=0;j<accounts[i].length;j++){
                calculate+=accounts[i][j];
            }
            if(maxWealth<calculate)
                maxWealth=calculate;
        }
        return maxWealth;
    }
}