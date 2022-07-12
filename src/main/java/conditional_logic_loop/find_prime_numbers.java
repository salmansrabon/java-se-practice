package conditional_logic_loop;
//7. Write a program to print prime numbers from 2 to n
public class find_prime_numbers {
    public static void main(String[] args) {
        getPrimeNumbers(50);
    }
    private static void getPrimeNumbers(int n) {
        int x, y, isPrime;
        System.out.println("All the Prime numbers within 1 and " + n + " are:");
        for (x = 1; x <= n; x++) {
            if (x == 1 || x == 0) {
                continue;
            }
            isPrime = 1;

            for (y = 2; y <= x / 2; y++) {
                if (x % y == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1) {
                System.out.println(x);
            }

        }
    }
}
