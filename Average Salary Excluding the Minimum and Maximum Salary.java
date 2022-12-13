class Solution {
    public double average(int[] salary) {
     int res = 0;
     double sum = 0.0;
     Arrays.sort(salary);
     for(int i=1; i<salary.length-1; i++){
          sum += salary[i];
          res++;  
     }

     return sum/res;
    }
}