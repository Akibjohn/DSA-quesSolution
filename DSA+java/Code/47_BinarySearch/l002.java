// leet code 33. Search in Rotated Sorted Array 
class Solution {
    public int search(int[] arr, int target) {
        int min=findMin(arr);
        if(check(arr,target)==true){
            int si=min,ei=arr.length-1;
            while(si<=ei){
                int mid=si+(ei-si)/2;
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]<target){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }else{
            int si=0,ei=min-1;
            while(si<=ei){
                int mid=si+(ei-si)/2;
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]<target){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
    
    public boolean check(int[] arr,int target){
        if(arr[arr.length-1]>target ||arr[arr.length-1]==target ){
            return true;
        }
        return false;
    }
    
    public int findMin(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[e]){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
        
    }
}
