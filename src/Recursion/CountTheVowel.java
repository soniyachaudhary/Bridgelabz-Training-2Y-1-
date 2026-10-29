package Recursion;

public class CountTheVowel {
        public static int countVowels(String name, int index) {
            if (index == name.length()) {
                return 0;
            }

            char ch = Character.toLowerCase(name.charAt(index));
            int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;

            return count + countVowels(name, index + 1);
        }

        public static void main(String[] args) {
            String name = "Soniya";
            int total = countVowels(name, 0);
            System.out.println("Total vowels: " + total);
        }
    }
