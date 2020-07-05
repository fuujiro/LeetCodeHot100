import java.util.HashSet;

public class T3 {
    class Solution {
        // 窗口法
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> hs = new HashSet<>();
            int len = s.length();
            // 右标，默认-1
            int r = -1, res = 0;
            for (int i = 0; i < len; i++) {
                if (i != 0) {
                    hs.remove(s.charAt(i - 1));
                }
                while (r + 1 < len && !hs.contains(s.charAt(r + 1))) {
                    hs.add(s.charAt(r + 1));
                    r++;
                }
                res = Math.max(res, r - i + 1);
            }
            return res;
        }
    }
}
