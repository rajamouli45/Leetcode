class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        int[] res=new int[nums.length];
        for(int p:nums){
            if(p>0) {
                res[pos]=p;
                pos+=2;
            }
            else{
                res[neg]=p;
                neg+=2;
            }
        }
        return res;
    }
}