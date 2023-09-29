//Moore voting algorithm(https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/)

class Solution {
    public int majorityElement(int[] nums) {
        int count=0, candidate=0;
        for(int n:nums){
            if(count==0)
                candidate=n;
            if(n==candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
}
