package Recursion;

public class ReplaceChar {
        public static String replaceChar(String name, int index) {
            if (index == name.length()) {
                return "";
            }
            char ch = name.charAt(index);
            String small = replaceChar(name, index + 1);
            if (ch == 'a') {
                return 'b' + small;
            } else {
                return ch + small;
            }
        }

        public static void main(String[] args) {
            String name = "banana";
            String result = replaceChar(name, 0);
            System.out.println("After replace: " + result);
        }
    }