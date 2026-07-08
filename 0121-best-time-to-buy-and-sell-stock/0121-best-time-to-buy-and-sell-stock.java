class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max1=0;
        for(int p:prices){
            if(p<min)
                min=p;
            else
                max1=Math.max(max1,p-min);
        }
        return max1;
    }
}