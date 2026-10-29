package Recursion;

public class FindMax_Element {
    public static void printForward(String name, int index) {
        if (index == name.length()) {
            return;
        }
        System.out.println(name.charAt(index));
        printForward(name, index + 1);
    }

    public static void printReverse(String name, int index) {
        if (index == name.length()) {
            return;
        }
        printReverse(name, index + 1);
        System.out.println(name.charAt(index));
    }

    public static boolean palindrome(String name, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (name.charAt(start) != name.charAt(end)) {
            return false;
        }
        return palindrome(name, start + 1, end - 1);
    }

    public static String remove(String name, int index) {
        if (index == name.length()) {
            return "";
        }
        String small = remove(name, index + 1);
        char ch = name.charAt(index);
        if (ch != 'a') {
            return ch + small;
        } else {
            return small;
        }
    }

    public static void main(String[] args) {
        String name = "madam";

        System.out.println("Forward:");
        printForward(name, 0);

        System.out.println("Reverse:");
        printReverse(name, 0);

        if (palindrome(name, 0, name.length() - 1)) {
            System.out.println(name + " is a palindrome");
        } else {
            System.out.println(name + " is not a palindrome");
        }

        String result = remove(name, 0);
        System.out.println("After removing 'a': " + result);
    }
}
