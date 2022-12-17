class Solution 
{
    public boolean checkStraightLine(int[][] coord) 
    {
        int dx = coord[0][0] - coord[1][0];
        int dy = coord[0][1] - coord[1][1];
        
        for (int i = 2; i < coord.length; ++i)
        {
            if ((coord[i][0] - coord[0][0]) * dy != (coord[i][1] - coord[0][1]) * dx)
            {
                return false;
            }
        }
        
        return true;
    }
}