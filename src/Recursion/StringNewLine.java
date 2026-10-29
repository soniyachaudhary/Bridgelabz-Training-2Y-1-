package Recursion;

public class StringNewLine {
        public static void printChars(String name, int index) {
            if (index == name.length()) {
                return;
            }
            System.out.println(name.charAt(index));
            printChars(name, index + 1);
        }

        public static void main(String[] args) {
            String name = "soniya";
            printChars(name, 0);
        }
    }

