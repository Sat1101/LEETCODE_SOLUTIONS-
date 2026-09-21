class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2)return 0;
        int max=nums[1]-nums[0];
        for(int i=0;i<nums.length-1;i++){
            int max2=(nums[i+1]-nums[i]);
            if(max<max2){
                max= max2;
            }
        }
        return max;
    }
}