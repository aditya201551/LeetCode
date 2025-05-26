class Solution {
    public int maxSubArray(int[] arr) {

        int maxSum = arr[0], currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

    }
}