package Recursion;

public class CountTheOccurence {
        public static int countChar(String name, char target, int index) {
            if (index == name.length()) {
                return 0;
            }
            int count = (name.charAt(index) == target) ? 1 : 0;
            return count + countChar(name, target, index + 1);
        }

        public static void main(String[] args) {
            String name = "madam";
            char target = 'a';
            int total = countChar(name, target, 0);
            System.out.println(target + " → " + total);
        }
    }


