class Solution {
    public int lengthOfLastWord(String s) {
        char [] arr=s.toCharArray();
        
        int n=arr.length;
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==' '){
                if(count>0){
                break;
                }
            }
            else{
                count++;
            }
        }
        return count;
    }
}