public class OperatorsPractice {

    // Uses modulo to check if a number is even
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Returns the last digit of a number using modulo
    int getLastDigit(int number) {
        return number % 10;
    }

    // Uses comparison operators to check if value is within range
    boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
}
