// https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

lass Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long p = 1;
        long[] ans = new long[n];
        int idx = 0;
        for(int i=0; i<n; i++){
            p=1;
            for(int j=0; j<n; j++){
                if(i != j)
                p = p * nums[j];
            }
           ans[idx++] = p; 
        }
        return ans;
	} 
}