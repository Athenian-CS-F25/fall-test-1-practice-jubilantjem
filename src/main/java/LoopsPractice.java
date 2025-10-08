public class LoopsPractice {

    // Uses for loop to sum numbers from 1 to n
    int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Uses loop to calculate factorial.
    // The factorial n (often written as "n!") is n * (n-1) * (n-2) * ... * 1
    int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
         return product;
    }

    // Uses loop to check if number is prime
    boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++ ) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
