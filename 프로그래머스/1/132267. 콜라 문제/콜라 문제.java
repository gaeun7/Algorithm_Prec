class Solution {
    public int solution(int a, int b, int n) {
        int ans = 0;
        while (n >= a) {
            int newBottles = (n / a) * b;
            ans += newBottles;
            n = newBottles + (n % a);
        }
        return ans;
    }
}