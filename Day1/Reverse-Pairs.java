// https://leetcode.com/problems/reverse-pairs/description/

class Solution {
    int mergeSort(int nums[], int low, int high){
        
        if(low>=high) 
            return 0;
        int mid=(low+high)/2;
        
        int inv=mergeSort(nums,low,mid);


        inv+=mergeSort(nums,mid+1,high); 
        inv+=merge(nums,low,mid,high);
        return inv;
    }
    
    static int merge(int nums[],int low,int mid,int high){
        int c=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high &&  nums[i]> (2* (long) nums[j])){
                j++;
            }
            c+=(j-(mid+1));
        }
        
        ArrayList<Integer> temp= new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right <=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }
        }
        while(left<=mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        for(int i = low; i<=high;i++) {
            nums[i] = temp.get(i - low); 
        }
        return c;
    }
    
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}