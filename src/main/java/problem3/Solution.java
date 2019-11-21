package problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        char[] chars = s.toCharArray();
        char[] map = new char[256];
        for (int i = 0; i < chars.length; i++) {
            int k = 0;
            int j = i;
            for (; j < chars.length; j++) {
                if (map[chars[j]] == 1) {
                    break;
                }
                k++;
                map[chars[j]] = 1;
            }
            while (i <= --j) {
                map[chars[j]] = 0;
            }
            maxSize = Math.max(maxSize, k);
        }
        return maxSize;
    }
}
