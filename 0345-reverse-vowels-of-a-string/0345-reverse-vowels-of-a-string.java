class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {

            while (i < j && !isVowel(ch[i])) {
                i++;
            }

            while (i < j && !isVowel(ch[j])) {
                j--;
            }

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return new String(ch);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
}