// class Solution {
//     public boolean searchMatrix(int[][] arr, int target) {
//         int fc=0;
//         int lc=arr[0].length-1;
//         int fr=0;
//         int lr=arr.length;
//         while(fc<=lc && fr<=lr){
//             if(arr[fr][lc]==target)return true;
//             else if(arr[fr][lc]<target)fr++;
//             else lc--;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = n * m - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return false;
    }
}