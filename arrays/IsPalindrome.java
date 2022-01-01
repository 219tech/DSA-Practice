class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        
        while(x > 0){
            reverse = (reverse * 10 ) + x % 10 ;
            x /= 10;
        }
        
        if(temp == reverse){
            return true;
        }
        
        return false;
    }
    
    //More efficient
    
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        if( x % 10 == 0) return false;
        int rev = 0;
        
        while(x > 0){
            int mod = x % 10;
            rev = rev * 10 + mod;
            x /= 10;
            if(x == rev || ( x >= 10 && x / 10 == rev )) return true;
        }
        
        return false;
    }
}
