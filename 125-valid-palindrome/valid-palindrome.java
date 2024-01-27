class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;

        s = s.toLowerCase();

        int i = 0, j = s.length() - 1;
        while (i < j) {
            // char left = s.charAt(i);
            // char right = s.charAt(j);

            if (!((s.charAt(i) >= 97 && s.charAt(i) <= 122) ||
                    (s.charAt(i) >= 48 && s.charAt(i) <= 57))) {
                i++;
            } else if (!((s.charAt(j) >= 97 && s.charAt(j) <= 122) ||
                    (s.charAt(j) >= 48 && s.charAt(j) <= 57))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }

        if (i == j && s.charAt(i) == s.charAt(j)) {
            return true;
        }

        return true;
    }
}