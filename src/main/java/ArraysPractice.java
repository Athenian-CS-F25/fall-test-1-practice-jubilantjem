public class ArraysPractice {

    // Creates array with sequential values, from start to end (inclusive)
    int[] createSequence(int start, int end) {
        int range= end - start + 1;
        int[] arr = new int[range];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start++;
        }
        return arr;
    }

    // Accesses middle element of array. Array will have an odd number of elements.
    int getMiddleElement(int[] arr) {
        int returnNum = 0;
        int midElement = arr.length/2;
        returnNum = arr[midElement];
        return returnNum;
    }

    // Loops through array to find maximum value
    int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Creates reversed version of array
    int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Checks if array is sorted (tests understanding of sorting)
    boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
