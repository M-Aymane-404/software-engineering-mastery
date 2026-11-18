class Solution {
    public int hammingWeight(int n) {
        int res = 0;
         int setBit =0;
        while(n>0){
           res = n%2 ;
            n/=2;
            if(res == 1){
                setBit ++;
            }
            
        }
        return setBit;
    }
}