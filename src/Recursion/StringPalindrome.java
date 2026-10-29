package Recursion;

public class StringPalindrome {
        public static boolean isPalindrome(String name, int start, int end) {
            if (start >= end) {
                return true;
            }
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            return isPalindrome(name, start + 1, end - 1);
        }

        public static void main(String[] args) {
            String name = "madam";

            if (isPalindrome(name, 0, name.length() - 1)) {
                System.out.println(name + " is a palindrome");
            } else {
                System.out.println(name + " is not a palindrome");
            }
        }
    }
