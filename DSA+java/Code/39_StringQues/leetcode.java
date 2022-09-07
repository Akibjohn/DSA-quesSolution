
// ques 2129
class Solution {
    public String toLowerCase(String str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char) (ch - 'A' + 'a'));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder ans = new StringBuilder();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            String str = arr[i];
            if (str.length() <= 2)
                ans.append(toLowerCase(str));
            else {
                char ch = str.charAt(0);
                if (ch >= 'a' && ch <= 'z') {
                    ans.append((char) (ch - 'a' + 'A'));
                } else {
                    ans.append(ch);
                }
                ans.append(toLowerCase(str.substring(1)));

            }
            if (i != n - 1)
                ans.append(" ");
        }

        return ans.toString();
    }

    // leetcode = 520
    public static boolean isCapital(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static boolean detectCapitalUse(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isCapital(ch)) {
                count++;
            }
        }
        if (count == n || count == 0)
            return true;
        else if (count == 1 && isCapital(str.charAt(0)))
            return true;

        return false;

    }

}