package Recursion;

public class StringLength {
        public static int findLength(String name, int index) {
            if (index == name.length()) {
                return 0;
            }
            return 1 + findLength(name, index + 1);
        }

        public static void main(String[] args) {
            String name = "soniya";
            int len = findLength(name, 0);
            System.out.println("Length: " + len);
        }
    }