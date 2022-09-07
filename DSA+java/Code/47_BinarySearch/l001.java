// import java.util.*;
public class l001 {
    public static int binarySearch(int[] arr, int ele) {
        int s = 0, e = arr.length - 1;
        
        while(s <= e) {
            int mid = (s + e) / 2; //better
            if(arr[mid] == ele) return mid;
            else if(arr[mid] <  ele) s = mid + 1;
            else e = mid - 1;
        }

        return -1;
    }

    
    public static int binarySearchFirstOccurance(int[] arr, int ele) {
        int s = 0, e = arr.length - 1;
        int ans = -1;
        while(s <= e) {
            int mid = (s + e) / 2; //better
            if(arr[mid] == ele)  {
                ans = mid;
                e = mid - 1;
            }
            else if(arr[mid] <  ele) s = mid + 1;
            else e = mid - 1;
        }

        return ans;
    }

	public static void main(String[] args) {
    //     int[] arr = {1, 4, 5, 6, 7, 8, 8, 8, 8 ,8,  8, 8, 8, 8, 10, 11, 13, 13, 13, 13, 13, 13, 13, 114};
    //     System.out.println(binarySearchFirstOccurance(arr, 80));

    System.out.println(3/4);
    }

    

    // leetcode 34
    // class Solution {
    // public int[] searchRange(int[] nums, int target) {
    //     return new int[] {binarySearchMulti(nums, target, true), 
    //                      binarySearchMulti(nums, target, false)};
    // }
    
    // public int binarySearchMulti(int[] arr, int ele, boolean focc) {
    //     int s = 0, e = arr.length - 1;
    //     int ans = -1;
    //     while(s <= e) {
    //         int mid = (s + e) / 2; //better
    //         if(arr[mid] == ele)  {
    //             ans = mid;
    //             if(focc == true) e = mid - 1;
    //             else s = mid + 1;
    //         }
    //         else if(arr[mid] <  ele) s = mid + 1;
    //         else e = mid - 1;
    //     }

    //     return ans;
    // }
// }


// leetcode 153
// class Solution {
    // public int findMin(int[] arr) {
    //     int s=0,e=arr.length-1;
    //     while(s<e){
    //         int mid=s+(e-s)/2;
    //         if(arr[mid]>arr[e]){
    //             s=mid+1;
    //         }else{
    //             e=mid;
    //         }
    //     }
    //     return arr[s];
        
    // }
// }


// koko leetcode


// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int s = 1, e = maxOfArray(piles);
//         int ans = e;
//         while(s <= e) {
//             int mid = s + ((e - s)/2);
//             int noh = getHours(piles, mid);
//             if(noh <= h) {
//                 ans = mid;
//                 e = mid - 1;
//             } else {
//                 s = mid + 1;
//             }
//         }
//         return ans;
//     }
    
//     public int getHours(int[] piles, int sp) {
//         int noh = 0;
//         for(int nob : piles)
//             noh += (int)Math.ceil(nob / (sp * 1.0));
//         return noh;
//     }
    
//     public int maxOfArray(int[] arr) {
//         int max = 0;
//         for(int i : arr) if(i > max) max = i;
//         return max;
//     }
    
// }


// 1428 leetcode
// class Solution {
//     public int minDays(int[] bloomDay, int m, int k) {
//         int s = 1, e = (int)1e9, ans = -1;
//         if(bloomDay.length < (m * k)) return ans;
//         while(s <= e) {
//             int mid = s + (e - s) / 2;
//             if(doable(bloomDay, mid, m, k)) {
//                 ans = mid;
//                 e = mid - 1;
//             } else s = mid + 1;
//         }
//         return ans;
//     }
    
//     public boolean doable(int[] arr, int days, int m, int k) {
//         int cf = 0;
//         for(int i : arr) {
//             if(i <= days) {
//                 cf ++;
//                 if(cf == k) {
//                     m --;
//                     cf = 0;
//                 }
//             } else {
//                 cf = 0;
//             }
//         }
//         return m <= 0;
//     }    
// }


// 1011 leetcode

// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int s = max(weights), e = (int)1e9, ans = 1;
//         while(s <= e) {
//             int mid = s + (e - s) / 2;
//             if(doable(weights, mid, days) == true)  {
//                 ans = mid;
//                 e = mid- 1;
//             } else {
//                 s = mid + 1;
//             }
//         }
//         return ans;
//     }
    
//     public boolean doable(int[] wts, int mcap, int days) {
//         int d = 1, cw = 0;
//         for(int i : wts) {
//             cw += i;
//             if(cw > mcap) {
//                 d ++;
//                 cw = i;
//             }
//         }
//         return d <= days;
//     }
    
    // public int max(int[] arr) {
    //     int max = arr[0];
    //     for(int i : arr) if(i > max) max = i;
    //     return max;
    // }

// 42 leetcode 
    // class Solution {
    //     public int trap(int[] arr) {
    //         int ans=0;
    //         for(int i=0;i<arr.length;i++){
    //             ans+=Math.min(leftMax(arr,i),rightMax(arr,i))-arr[i];
    //         }
    //         return ans;
            
    //     }
        
    //     public int leftMax(int[] arr,int i){
    //         int max = arr[i];
    //         for(int j=i;j>=0;j--) if(arr[j] > max) max = arr[j];
    //         return max;
    //     }
        
    //     public int rightMax(int[] arr,int i){
    //         int max = arr[i];
    //         for(int j=i;j<arr.length;j++) if(arr[j] > max) max = arr[j];
    //         return max;
    //     }
    // }
    
// }

}