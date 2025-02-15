import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T448 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> res = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            for (int i = 1; i <= nums.length; i++) {
                if(!set.contains(i))
                    res.add(i);
            }
            return res;
        }
    }
}
