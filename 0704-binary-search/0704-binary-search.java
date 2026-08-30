class Solution {
    public int search(int[] nums, int target) {
        return BS(nums,0,nums.length-1,target);  
    }
    public static int BS(int[] nums,int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(nums[mid]==target)
            return mid;
        if(target>nums[mid])
            return BS(nums,mid+1,high,target);
        return BS(nums,low,mid-1,target);
    }
}