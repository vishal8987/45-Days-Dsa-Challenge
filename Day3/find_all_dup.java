// https://leetcode.com/problems/find-all-duplicates-in-an-array/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> v= new ArrayList<>();
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<n;i++){
                if(s.contains(nums[i]))
                {
                    v.add(nums[i]);
                }
                s.add(nums[i]);
        }
        return v;
    }
}