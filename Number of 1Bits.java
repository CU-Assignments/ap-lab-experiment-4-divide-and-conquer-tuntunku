public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        
        return count;
    }
}
/*
n =
11
Output
3
Expected
3
*/
