// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int curr=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            curr=target-nums[i];
            if(map.containsKey(curr)){
                return new int [] { i, map.get(curr)};
            }
            map.put(nums[i],i);
        }
        return new int [] {};
    }
}