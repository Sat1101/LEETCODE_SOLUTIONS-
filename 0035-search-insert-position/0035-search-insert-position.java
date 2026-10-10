class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n;
        while(i<j){
            int mid=(i+j)/2;
            if(target==nums[mid])return mid;
            else if(target>nums[mid])i=mid+1;
            else j=mid;
        }
        return i;
    }
}