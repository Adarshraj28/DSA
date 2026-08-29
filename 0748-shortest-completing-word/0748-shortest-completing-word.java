class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];

        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                need[Character.toLowerCase(c) - 'a']++;
            }
        }
        String answer = null;

        for (String word : words) {
            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            boolean complete = true;

            for (int i = 0; i < 26; i++) {
                if (count[i] < need[i]) {
                    complete = false;
                    break;
                }
            }
            if (complete && (answer == null || word.length() < answer.length())) {
                answer = word;
            }
        }

        return answer;
    }
}
