public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= maxChoosableInteger) {
            return true;
        }
        if (((1 + maxChoosableInteger) * maxChoosableInteger) / 2 < desiredTotal) {
            return false;
        }
        int size = Integer.bitCount(maxChoosableInteger);
       Boolean[] memo = new Boolean[1 << (maxChoosableInteger + 1)];

        return dfs(maxChoosableInteger, desiredTotal, 0, 0, memo);
    }

    private boolean dfs(int maxChoosableInteger, int desiredTotal, int mask, int total, Boolean[] memo) {
        // System.out.println(Integer.toBinaryString(mask));
        if(memo[mask] != null){
            return memo[mask];
        }
        boolean result = false;

        for (int i = 1; i <= maxChoosableInteger; i++) {
            if ((mask & (1 << i)) == 0) {
                if (total + i >= desiredTotal) {
                    result = true;
                } else {
                    boolean result2 = dfs(maxChoosableInteger, desiredTotal, mask | (1 << i), total + i, memo);
                    if (!result2) {
                        result = true;
                    }
                }
            }
        }
        memo[mask] = result;
        return result;

    }
}

