package recursion;
public class Palindrome {
    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeHelper(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is \"" + str + "\" a palindrome?  : " + isPalindrome(str));
    }
}
