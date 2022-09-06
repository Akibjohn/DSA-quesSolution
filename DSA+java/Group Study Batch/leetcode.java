// 152 leetcode

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,ans=nums[0];
        int pmax=nums[0],pmin=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=pmax;
                pmax=pmin;
                pmin=temp;
            }
            pmax=Math.max(nums[i],nums[i]*pmax);
            pmin=Math.min(nums[i],nums[i]*pmin);
            ans=Math.max(ans,pmax);
        }
        return ans;
        
    }
}
 
//     public int trap(int[] arr) {
//         int n=arr.length;
//         int ans = 0;
//         int[] lMax = new int[n];
//         lMax[0] = arr[0];
//         for(int i = 1 ; i < n ; i++){
//             lMax[i] = Math.max(arr[i] , lMax[i-1]);
//         }
//         int[] rMax = new int[n];
//         rMax[n-1] = arr[n-1]; 
//         for(int i = n-2 ; i >= 0 ; i--){
//             rMax[i] = Math.max(arr[i] , rMax[i+1]);
//         }
        
//         for(int i = 0 ; i < n ; i++){
//             ans += Math.min(lMax[i] , rMax[i]) - arr[i];
//         }
//         return ans;
//     }
// }