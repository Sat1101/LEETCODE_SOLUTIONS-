class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
       int[] c =new int[a.length+b.length];
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            c[k]=a[i];
            i++;
            k++;
        }
        else{
            c[k]=b[j];
            j++;
            k++;
        }
      }
      while(i<a.length){
        c[k++]=a[i++];
      }
      while(j<b.length){
        c[k++]=b[j++];
      }
      double median;
      if((c.length)%2==0){
        median = (c[(c.length/2)-1]+c[(c.length)/2])/2.0;
      }
      else{
        median=c[c.length/2];
      }
      return median;
    }
}