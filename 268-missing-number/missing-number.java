class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumN=(n*(n+1))/2;
        int sumNum=0;

        for(int i=0;i<n;i++){
            sumNum+=nums[i];
        }

        return sumN-sumNum;


    }
}