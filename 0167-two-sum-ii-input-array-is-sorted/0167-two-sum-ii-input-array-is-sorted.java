class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int[] a=new int[2];
        int[] b=new int[0];
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
            else if(sum>target)j--;
            else{
                i++;
            }
        }
        return b;
    }
}