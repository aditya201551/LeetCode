class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1)
            return;
        
        if(nums.length==2 && nums[0]==0){
            nums[0]=nums[1];
            nums[1]=0;
        }

        int zeroCount=0;
        for(int i: nums){
            if(i==0){
                zeroCount++;
            }
        }

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        while(j<nums.length){
            nums[j++]=0;
        }
    }
}