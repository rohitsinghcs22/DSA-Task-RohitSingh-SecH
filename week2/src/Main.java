class peak_index_in_mountanArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start + (end-start)/2;
            if(( mid-1>=0 && arr[mid]>arr[mid-1]) && (mid+1<=arr.length-1 && arr[mid]>arr[mid+1])){
                return mid;

            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return mid;
    }
}

public class island_peri {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++;
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++;
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}

class Solution {
    public long minEnd(int n, int x) {
        long a = x;
        while (--n > 0)
            a = (a + 1) | x;
        return a;
    }
}

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
            else if(isBadVersion(mid)==false ) low = mid+1;
            else high= mid;
        }
        return -1;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=matrix[0].length-1;
        int a=0;
        int start=0;
        int end=matrix[0].length-1;
        while(start<=end && a<matrix.length){
            int mid=start + (end-start)/2;
            if(matrix[a][mid]<target){
                if(target > matrix[a][c]){
                    a++;
                }
                else{
                    start=mid+1;
                }

            }
            else if(matrix[a][mid]>target){
                end=mid-1;
            }
            else{
                return true;
            }
        }

        return false;

    }
}

class Solution {
    private int productDigits(int x) {
        int product = 1;
        while (x > 0) {
            int digit = x % 10;
            product *= digit;
            x /= 10;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        int m = n;
        while (true) {
            int digitProduct = productDigits(m);
            if (digitProduct % t == 0) {
                return m;
            }
            m++;
        }
    }
}