package ArrayString;

/*
    Given a string s, return true if it is a palindrome, false otherwise.
*/

public class Palindrome {
    public boolean palindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
