class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=nums.length-1;j>2;j--){
                if(j<nums.length-1 && nums[j]==nums[j+1]){
                continue;
                }
                int k=i+1;
                int x=j-1;
                while(k<x){
                    long sum=(long) nums[i]+nums[j]+nums[k]+nums[x];
                    if(sum>target){
                    x--;
                }
                else if(sum<target){
                    k++;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[x]));
                    while(k<x && nums[k]==nums[k+1]){
                        k++;
                    }
                    while(k<x && nums[x]==nums[x-1]){
                        x--;
                    }
                    k++;
                    x--;
                }
                }
            }
        }
        return ans;
    }
}