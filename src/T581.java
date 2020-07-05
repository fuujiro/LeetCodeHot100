import java.util.Arrays;

public class T581 {
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] cnum = nums.clone();
            Arrays.sort(cnum);
            int start = cnum.length, end = 0;
            for (int i = 0; i < nums.length; i++) {
                if (cnum[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start >= 0 ? end - start + 1 : 0);
        }
    }
}
