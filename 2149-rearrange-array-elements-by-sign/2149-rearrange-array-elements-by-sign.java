class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k=nums.length;
        int [] a=new int[k/2];
        int x=0;
        int[] b=new int[k/2];
        int y=0;
        for(int i=0;i<k;i++){
            if(nums[i]<0){
                a[x]=nums[i];
                x++;
            }
            else{
                b[y]=nums[i];
                y++;
            }
        }
        int i=0;
        int j=0;
        for(int z=0;z<k;z++){
            if(z%2==0){
                nums[z]=b[i];
                i++;
                
            }
            else{
                nums[z]=a[j];
                j++;
              
            }
        }
        return nums;
    }
}