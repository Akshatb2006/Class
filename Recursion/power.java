
class Solution {
    public double myPow(double x, int n) {
        return pow(x, n);
    }

    private double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double ans = pow(x, n / 2);
        double finalans = ans * ans;
        if (n % 2 == 1) {
            return x * finalans;
        }
        if (n % 2 == -1) {
            return finalans / x;
        }
        return finalans;
    }
}
