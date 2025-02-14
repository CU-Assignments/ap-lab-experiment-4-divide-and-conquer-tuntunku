class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a %= MOD;
        int result = 1;
        
        for (int digit : b) {
            result = (powMod(result, 10) * powMod(a, digit)) % MOD;
        }
        
        return result;
    }

    private int powMod(int x, int y) {
        int result = 1;
        x %= MOD;
        
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }
        
        return result;
    }
}
/*
a =
2
b =
[3]
Output
8
Expected
8
*/
