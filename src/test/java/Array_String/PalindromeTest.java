package Array_String;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testPalindromeTrue() {
        Palindrome solution = new Palindrome();
        boolean ans = solution.palindrome("racecar");
        Assert.assertTrue(ans);
    }
    @Test
    public void testPalindromeFalse() {
        Palindrome solution = new Palindrome();
        boolean ans = solution.palindrome("racecar1");
        Assert.assertFalse(ans);
    }
}
