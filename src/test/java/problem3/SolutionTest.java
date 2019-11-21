package problem3;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals(new Solution().lengthOfLongestSubstring("abcabcbb"), 3);
    }

}
