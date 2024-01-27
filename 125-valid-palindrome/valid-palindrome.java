class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;

        s = s.toLowerCase();

        int i = 0, j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!((left >= 97 && left <= 122) ||
                    (left >= 48 && left <= 57))) {
                i++;
            } else if (!((right >= 97 && right <= 122) ||
                    (right >= 48 && right <= 57))) {
                j--;
            } else {
                if (left != right) {
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