public class NextGreatestLetterFinder {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If target is greater than or equal to last letter,
        // wrap around and return first letter
        return letters[start % letters.length];
    }

    public static void main(String[] args) {

        // Test Case 1 (Active)
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';

        char result1 = nextGreatestLetter(letters1, target1);
        System.out.println("Next greatest letter after '" + target1 + "' is: " + result1);

        /*
        // Test Case 2 (Wrap-around case)
        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'k';

        char result2 = nextGreatestLetter(letters2, target2);
        System.out.println("Next greatest letter after '" + target2 + "' is: " + result2);
        */
    }
}