import java.util.Arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        
         int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
           if(nums[i]==nums[i+1]){
            return nums[i];
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindDuplicate finder = new FindDuplicate();
        
        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println(finder.findDuplicate(nums1));  // Output: 2
        
        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println(finder.findDuplicate(nums2));  // Output: 3
        
        int[] nums3 = {3, 3, 3, 3, 3};
        System.out.println(finder.findDuplicate(nums3));  // Output: 3
    }
}
