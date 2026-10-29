package Recursion;

public class GCD {

        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public static void main(String[] args) {
            int a = 12, b = 16;
            System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
        }
    }
