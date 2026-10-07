class Solution {

    Set<String> ans = new HashSet<>();
    String s;
    int n;

    public List<String> removeInvalidParentheses(String s) {

        this.s = s;
        this.n = s.length();

        int left = 0;
        int right = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                left++;
            }
            else if (c == ')') {

                if (left > 0) {
                    left--;
                }
                else {
                    right++;
                }
            }
        }

        dfs(0, left, right, 0, 0, "");

        return new ArrayList<>(ans);
    }

    private void dfs(int i, int leftRemove, int rightRemove,
                     int open, int close, String curr) {

        if (i == n) {

            if (leftRemove == 0 &&
                rightRemove == 0 &&
                open == close) {

                ans.add(curr);
            }

            return;
        }

        if (open < close) {
            return;
        }

        char c = s.charAt(i);

        if (c == '(' && leftRemove > 0) {
            dfs(i + 1,
                leftRemove - 1,
                rightRemove,
                open,
                close,
                curr);
        }

        if (c == ')' && rightRemove > 0) {
            dfs(i + 1,
                leftRemove,
                rightRemove - 1,
                open,
                close,
                curr);
        }

        if (c == '(') {

            dfs(i + 1,
                leftRemove,
                rightRemove,
                open + 1,
                close,
                curr + c);

        }
        else if (c == ')') {

            dfs(i + 1,
                leftRemove,
                rightRemove,
                open,
                close + 1,
                curr + c);

        }
        else {
            dfs(i + 1,
                leftRemove,
                rightRemove,
                open,
                close,
                curr + c);
        }
    }
}