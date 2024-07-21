// https://leetcode.com/problems/majority-element/


class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int cur=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==cur)
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
            {
                cur=nums[i];
                count++;
            }
        }
        return cur;
    }
}