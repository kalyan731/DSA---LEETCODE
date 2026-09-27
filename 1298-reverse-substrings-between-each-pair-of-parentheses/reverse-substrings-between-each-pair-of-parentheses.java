class Solution {
    public String reverseParentheses(String s) {

        while (s.contains("(")) {

            int close = s.indexOf(')');
            int open = s.lastIndexOf('(', close);

            String inside = s.substring(open + 1, close);

            String rev = reversek(inside);

            s = s.substring(0, open) + rev + s.substring(close + 1);
        }

        return s;
    }

    public String reversek(String s) {

        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}