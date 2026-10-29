package Recursion;
public class RemoveChar {
        public static String removeChar(String name, char target, int index) {
            if (index == name.length()) {
                return "";
            }
            char ch = name.charAt(index);
            String small = removeChar(name, target, index + 1);
            if (ch == target) {
                return small;
            } else {
                return ch + small;
            }
        }

        public static void main(String[] args) {
            String name = "banana";
            char target = 'a';
            String result = removeChar(name, target, 0);
            System.out.println("After removing '" + target + "': " + result);
        }
    }
