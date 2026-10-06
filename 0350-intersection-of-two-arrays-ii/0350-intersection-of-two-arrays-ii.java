class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr=new int[Math.min(arr1.length,arr2.length)];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]) {
                
                arr[k]=arr1[i];
                k++;
               
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]) j++;
            else i++;
        }
        return Arrays.copyOf(arr,k);
    }
}