class Solution {
    public int subarraySum(int[] nums, int k) {
        int sub=0,n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k)
                    sub+=1;
            }
        }
        return sub;
    }
}