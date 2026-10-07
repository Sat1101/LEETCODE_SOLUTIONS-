class Solution {
    public int findDuplicate(int[] arr){
        int n=arr.length;
        int i=0;
        while(i<n){
            int idx=arr[i]-1;
            if(arr[i]==i+1 ||arr[idx]==arr[i])i++;
            else{
                
               
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1)return arr[i];
        }
        return 0;
    }
}