public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flight","flower","car"};

        String prefix = commonPrefix(words);

        System.out.println(prefix);
        // return empty string

        String[] words2 = {"flight","flower","flamingo"};

        String prefix2 = commonPrefix(words2);

        System.out.println(prefix2);
        // Return "fl" (2 letters)
    }

    private static String commonPrefix(String[] words) {
        // Common letter counter
        int counter = 0;

        external:
        for (int i = 0; i < words[0].length(); i++) {

            // Get letter from first word
            char letter = words[0].charAt(i);

            // Check rest of the words on that same positions
            for (int j = 1; j < words.length; j++) {
                // Break when word is shorter or letter is different
                if (words[j].length() <= i || letter != words[j].charAt(i)) {
                    break external;
                }
            }

            // Increase counter, because all of words
            // has the same letter (e.g. "E") on the same position (e.g. position "5")
            counter++;
        }

        // Return proper substring
        return words[0].substring(0, counter);
    }
}
