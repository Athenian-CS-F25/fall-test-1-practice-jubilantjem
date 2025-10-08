public class StringsPractice {

    // Uses charAt() and comparison in a loop to determine the number of vowels in str
    int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'a' ) {
                count++;
            } else if (c == 'e') {
                count ++;
            } else if (c == 'i') {
                count++;
            } else if (c == 'o') {
                count++;
            } else if (c=='u') {
                count++;
            }
        }
        return count;
    }

    // Check if two strings are the same
    boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    // Uses ASCII values to check if character is uppercase
    boolean isUppercase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    // Converts letter to position (A=1, B=2, etc.) using ASCII
    int getAlphabetPosition(char letter) {
        return Character.toUpperCase(letter) - 64;
    }
}
