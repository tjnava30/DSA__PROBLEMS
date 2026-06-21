class Solution {
    public int reverse(int x) {
        int rev=0;
        if(x>=Integer.MAX_VALUE/10) return 0;
        if(x<Integer.MIN_VALUE/10) return 0;

        while(x!=0){
            int r=x%10;
            rev=rev*10+r;
            x /= 10;
        }
        return rev;
    }
}
