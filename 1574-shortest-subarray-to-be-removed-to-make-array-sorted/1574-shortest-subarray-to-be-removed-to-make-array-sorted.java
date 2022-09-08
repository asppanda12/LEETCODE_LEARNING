class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        
        int i = 0, j = arr.length - 1;
        
        while (i < j && arr[i] <= arr[i + 1]) {
            i++;
        }
        
        if (i == arr.length - 1) {
            return 0;
        }
        
        while (j > 0 && arr[j] >= arr[j - 1]) {
            j--;
        }
        
        int minLength = Math.min (arr.length - i - 1, j);
        int k = i;
        i = 0;
        
        while (i <= k && j < arr.length) {
            if (arr[i] <= arr[j]) {
                minLength = Math.min (minLength, j - i - 1);
                i++;
            }
            else {
                j++;
            }
        }
        
        return minLength;
    }
}
