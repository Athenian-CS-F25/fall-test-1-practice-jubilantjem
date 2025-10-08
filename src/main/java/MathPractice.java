public class MathPractice {

    // Returns a random number between 1-6 using Math.random()
    int rollDice() {
        int rollDie = 0;
        rollDie = (int) (Math.random()*6) + 1;
        return rollDie;
    }

    // Returns random int in specified range (inclusive)
    int randomInRange(int min, int max) {
        int randomNumber = 0;
        int range = max - min + 1;
        randomNumber = (int) (Math.random() * range);
        randomNumber += min;
        return randomNumber;
    }

    // Calculates distance between two points using Math.abs() and Math.sqrt()
    // To calculate distance, think about the rectangle formed by the two points.
    // Use the Pythagorean Theorem to find the length of the diagonal across the rectangle.
    double distance(double x1, double y1, double x2, double y2) {
        double distance;
        double a = Math.abs(x2 - x1);
        double b = Math.abs(y2 - y1);
        distance = Math.sqrt((a * a) + (b * b));
        return distance;
    }

    // Extracts integer part of a double using casting
    int getWholePart(double number) {
        return (int) number;
    }

    // Returns average, demonstrating int to double casting
    double calculateAverage(int sum, int count) {
        double average = (double) sum/count;
        return average;
    }
}
