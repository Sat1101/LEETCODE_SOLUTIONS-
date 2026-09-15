class Solution {
    public int maximumCount(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]<=0)i=mid+1;
            else j=mid-1;
        }
        int Pcount=nums.length-i;
        i=0;
        j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>=0)j=mid-1;
            else i=mid+1;
        }
        int Ncount=i;
        if(Ncount>Pcount)return Ncount;
        else return Pcount;
    }
}