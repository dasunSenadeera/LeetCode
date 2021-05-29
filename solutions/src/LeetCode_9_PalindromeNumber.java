public class LeetCode_9_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(!isPalindrome(123));
        System.out.println(isPalindrome(12321));
        System.out.println(!isPalindrome(12345));
        System.out.println(!isPalindrome(-12345));
        System.out.println(!isPalindrome(100));
        System.out.println(isPalindrome(0));
    }

    private static boolean isPalindrome(int n) {
        if (n < 0 || (n % 10 == 0 && n != 0)) {
            return false;
        }
        int reversedNum =0, pop;
        while (n > reversedNum) {
            pop = n % 10;
            reversedNum = reversedNum * 10 + pop;
            n = n / 10;
        }
        return n == reversedNum || n == reversedNum / 10;
    }
}
