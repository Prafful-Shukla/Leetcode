
// Intuition
// Sanitize input for duplicate words and bad words (word that contains duplicate characters)
// Backtrack and find the largest possible solution
// We can expand the backtrack search only if adding the word at the current index i doesn't cause a duplicate letter to appear. This is done efficiently by casting the strings s1 and s2 to sets and checking the intersection.

//Code
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int maxLength(List<String> arr) {
        // Remove duplicate words and words with duplicate letters
        List<String> sanitizedArr = Set.copyOf(arr)
                        .stream()
                        .filter(this::wordWithDuplicateLetter)
                        .toList();

        return maxLengthBacktrack(sanitizedArr, 0, "");
    }

    private boolean wordWithDuplicateLetter(String s) {
        int[] letter = new int[26];
        for (char chr : s.toCharArray()) {
            letter[chr - 'a']++;
            if (letter[chr - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }

    private int maxLengthBacktrack(List<String> source, int index, String runningConcatenation) {
        if (index == source.size()) {
            return runningConcatenation.length();
        }

        int maxLength = 1;

        // Option 1: don't concatenate
        maxLength = Math.max(maxLength, maxLengthBacktrack(source, index + 1, runningConcatenation));

        // Option 2: concatenate if you can
        String currentWord = source.get(index);
        if (!hasSharedCharacters(runningConcatenation.toString(), currentWord)) {
            maxLength = Math.max(maxLength, maxLengthBacktrack(source, index + 1, runningConcatenation + currentWord));
        }

        return maxLength;
    }

    /**
     * We want to make this operation O(|S1| + |S2|) and not O(|S1|*|S2|) therefore working with sets is easier as it is O(1) lookup
     */
    private boolean hasSharedCharacters(String s1, String s2) {
        Set<String> setS1 = s1.chars().boxed().map(Character::toString).collect(Collectors.toSet());
        Set<String> setS2 = s2.chars().boxed().map(Character::toString).collect(Collectors.toSet());
        return setS1
                .stream()
                .anyMatch(setS2::contains);
    }
}
