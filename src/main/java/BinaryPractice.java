public class BinaryPractice {

    // Converts decimal to binary string
    String decimalToBinary(int decimal) {
        String toReturn = "";
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            toReturn = (decimal % 2) + toReturn;
            decimal /= 2;
        }
        return toReturn;
    }


    // Converts binary string to decimal
    //Ex. 101
    //
    int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i< binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binary.length() - 1 -i);
            }
        }
        return decimal;
    }

    // Use what you know about binary to determine if number is a power of two
    boolean isPowerOfTwo(int number) {
        while (number > 1) {
            if (number % 2 != 0) {
                return false;
            } else {
                number /= 2;
            }
        }
        return true;
    }
}
