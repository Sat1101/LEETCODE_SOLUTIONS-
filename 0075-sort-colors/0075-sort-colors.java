class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int count0=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)count0++;
            if(nums[i]==1)count1++;
        }
        for(int i=0;i<n;i++){
            if(count0>0){
            nums[i]=0;
            count0--;
            }
            else if(count1>0){
                nums[i]=1;
                count1--;
            }
            else{
                nums[i]=2;
            }
        }
    }
}