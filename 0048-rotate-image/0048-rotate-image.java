class Solution {
    public void rotate(int[][] arr) {
         for(int i=1;i<arr.length;i++){
           for(int j=0;j<i;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       }
       for(int i=0;i<arr.length;i++){
           int strCol=0,endCol=arr[0].length-1;
           while(strCol<endCol){
               int temp=arr[i][strCol];
               arr[i][strCol]=arr[i][endCol];
               arr[i][endCol]=temp;
               strCol++;
               endCol--;
           }
       }
    }
}