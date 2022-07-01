class Solution {
    public boolean isPowerOfFour(int n) {
        int kapa=(int)(Math.log(n)/Math.log(4));
        int val=1;
        for(int i=0;i<kapa;i++)
        {
            val*=4;
        }
        return val==n;
    }
}