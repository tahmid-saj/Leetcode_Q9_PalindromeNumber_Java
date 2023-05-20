class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int res = 0;
        int x_old = x;
        while (x > 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }

        System.out.println(res);

        return res == x_old;
    }
}
