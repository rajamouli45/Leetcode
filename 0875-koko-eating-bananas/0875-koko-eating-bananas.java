class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length,left=1,right=0;
        for(int pile:piles)
            right=Math.max(right,pile);
        while(left<right){
            int mid=(left+right)/2;
            long hrs=0;
            for(int pile:piles)
                hrs+=(pile+mid-1)/mid;
            if(hrs<=h)
                right=mid;
            else
                left=mid+1;
        }
        return left;
        

    }
}