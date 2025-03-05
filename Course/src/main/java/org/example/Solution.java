package org.example;

public class Solution {

    public static int matchPattern(String input, String pattern) {
        int[] backtrackArray = prepareBacktrackArray(pattern); // Prepare backtrack (LPS) array
        int inputPointer = 0; // Pointer to traverse the input string
        int patternPointer = 0; // Pointer to traverse the pattern string
        int inputLength = input.length();
        int patternLength = pattern.length();

        while (inputPointer < inputLength) {
            if (isMatch(input.charAt(inputPointer), pattern.charAt(patternPointer))) {
                // Characters match or wildcard is encountered
                inputPointer++;
                patternPointer++;
            }

            if (patternPointer == patternLength) {
                // Full pattern matched
                return inputPointer - patternPointer;
            }

            if (inputPointer < inputLength && !isMatch(input.charAt(inputPointer), pattern.charAt(patternPointer))) {
                // Mismatch encountered
                if (patternPointer > 0) {
                    patternPointer = backtrackArray[patternPointer - 1];
                } else {
                    inputPointer++;
                }
            }
        }

        return -1; // No match found
    }

    // Check if characters match or pattern contains a wildcard
    private static boolean isMatch(char inputChar, char patternChar) {
        return patternChar == '*' || inputChar == patternChar;
    }

    // Prepare the backtrack array (LPS array)
    private static int[] prepareBacktrackArray(String pattern) {
        int[] backtrackArray = new int[pattern.length()];
        int previousLongest = 0; // Tracks the length of the longest prefix that is also a suffix
        int currentIndex = 1; // Start from the second character

        while (currentIndex < pattern.length()) {
            if (isMatch(pattern.charAt(currentIndex), pattern.charAt(previousLongest))) {
                // Match extends the current prefix
                previousLongest++;
                backtrackArray[currentIndex] = previousLongest;
                currentIndex++;
            } else {
                if (previousLongest > 0) {
                    // Reduce the size of the matching prefix
                    previousLongest = backtrackArray[previousLongest - 1];
                } else {
                    // No prefix match; move to the next character
                    backtrackArray[currentIndex] = 0;
                    currentIndex++;
                }
            }
        }

        return backtrackArray;
    }

    public static void main(String[] args) {
        String input = "xabcdey";
        String pattern = "ab*de";
        System.out.println(matchPattern(input, pattern)); // Output: 1
    }
}