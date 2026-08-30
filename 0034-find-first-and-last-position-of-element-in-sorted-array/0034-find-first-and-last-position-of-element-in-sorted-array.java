class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int[] res={-1,-1};
        int mid=(low+high)/2;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                res[1]=mid;
                low=mid+1;
            }
            else if(target>nums[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        if(res[1]==-1)
            return res;
        low=0;
        high=nums.length-1;
        while(low<=high){
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                res[0] = mid;
                high = mid - 1;
            }
            else if(target>nums[mid])
                low=mid+1;
            else
                high = mid - 1;
        }
        return res;
    }
}