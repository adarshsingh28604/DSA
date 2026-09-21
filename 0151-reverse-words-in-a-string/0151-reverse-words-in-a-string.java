class Solution {
    public String reverseWords(String s) {

        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (j >= 0) {

            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            if (j < 0) break;

            int end = j;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            for (int k = j + 1; k <= end; k++) {
                sb.append(s.charAt(k));
            }

            sb.append(" ");
        }
        return sb.toString().trim();
    }
}