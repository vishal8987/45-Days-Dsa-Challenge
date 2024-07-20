// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[k]){
                nums[k+1]=nums[i];
                k++;
            }
        }
        return k+1;
    }
}