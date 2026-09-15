class Solution {
    public int sqrt(long n){
        long i=0,j=n;
        while(i<=j){
            long mid=i+(j-i)/2;
            if(mid<n/mid)i=mid+1;
            else if(mid>n/mid)j=mid-1;
            else{
                return (int) mid;
            }
        }
        return (int)j;
    }
    public int arrangeCoins(int n) {
        long m=(long)n;
        return (int)(sqrt(8*m+1)-1)/2;
    }    
}