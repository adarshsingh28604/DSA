class Solution {
    public String[] findWords(String[] words) {

        String[] rows = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };

        ArrayList<String> ans = new ArrayList<>();

        for (String word : words) {

            String s = word.toLowerCase();

            int row = -1;
            boolean valid = true;

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);
                int currentRow = -1;

                for (int j = 0; j < 3; j++) {
                    if (rows[j].indexOf(ch) != -1) {
                        currentRow = j;
                        break;
                    }
                }

                if (row == -1) {
                    row = currentRow;
                }
        
                else if (row != currentRow) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}