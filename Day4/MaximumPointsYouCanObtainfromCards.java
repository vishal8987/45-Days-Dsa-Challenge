// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
        int lsum=0;
        int maxsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
            maxsum=lsum;
        }
        System.out.println(lsum);
        int rindex=n-1;
        for(int j=k-1;j>=0;j--){
            lsum-=nums[j];
            rsum=rsum+nums[rindex];
            rindex--;
        maxsum=Math.max(maxsum ,lsum+rsum);
        }
        return maxsum;

    }
}