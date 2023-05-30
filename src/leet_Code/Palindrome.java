package leet_Code;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
          String str = Integer.toString(x);
          String reverseString = new StringBuilder(str).reverse().toString();
          return str.equals(reverseString);

    }

}
