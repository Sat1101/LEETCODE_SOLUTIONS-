class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target) return mid;
            if(arr[i]<=arr[mid]){
                if(arr[i]<=target&& target< arr[mid]) j=mid-1;
                else i=mid+1;
            }
            else{
                if(arr[mid]<target && target<=arr[j])i=mid+1;
                else j=mid-1;
            }
        }
        return -1;
    }
}