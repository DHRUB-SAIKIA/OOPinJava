//Q5.Check Palindrome String
//Write a function isPalindrome(String str) that checks if the given string is a palindrome.

public class Q5CheckPalindromeString
{
    public static boolean isPalindrome(String str)
    {
        if (str == null)
        {
            return false; // null is not a palindrome
        }

        // Normalize: remove spaces, punctuation, and lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("hello"));
    }
}
