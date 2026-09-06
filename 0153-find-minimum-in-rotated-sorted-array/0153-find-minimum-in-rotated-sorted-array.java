class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,low=0,high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[high]<=nums[mid]){
                low=mid+1;
            }
            else
                high=mid;
        }
        return nums[low];
    }
}