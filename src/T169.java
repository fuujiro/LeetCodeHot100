import java.util.HashMap;
import java.util.Map;

public class T169 {
    class Solution {
        private Map<Integer,Integer> countNums(int[] nums) {
            Map<Integer,Integer> hm = new HashMap<>();
            for (int num : nums) {
                if(!hm.containsKey(num)) {
                    hm.put(num,1);
                } else {
                    hm.put(num,hm.get(num)+1);
                }
            }
            return hm;
        }
        public int majorityElement(int[] nums) {
            Map<Integer,Integer> hm = countNums(nums);
            Map.Entry<Integer,Integer> majorityEntry = null;
            for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
                if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                    majorityEntry = entry;
                }
            }
            return majorityEntry.getKey();
        }
    }
}
