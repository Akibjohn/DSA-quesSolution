
public class rangeAddition {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        // [0,0,0,0,0]
        // [0,2,0,0,-2]
        // [0,2,3,0,-2]
        // [-2,2,3,2,-2]
        for(int[] update : updates){
            int si = update[0];
            int ei = update[1];
            int inc = update[2];
            ans[si] += inc;
            if(ei < ans.length-1){
                ans[ei+1] -= inc;
            }
        }
        // [-2,2,3,2,0]
        // prev = 0
        // i=0,prev = -2
        // ans[0] = -2 -> [-2,2,3,2,-2]
        // i=1,prev = -2+2
        // ans[1] = 0 -> [-2,0,3,2,-2]
        // i=2,prev = 0+3
        // ans[2] = 3 -> [-2,0,3.2.-2]
        // i=3,prev = 3+2
        // ans[3] = 5 -> [-2,0,3,5,-2]
        // i=4,prev = 5-2
        // ans[4] = 3 -> [-2,0,3,5,3]
        int prev = 0;
        for(int i=0;i<ans.length;i++){
            prev += ans[i];
            ans[i] = prev;
        }
        return ans;
    }
}