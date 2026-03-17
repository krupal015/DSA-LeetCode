class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int revNum = 0;
        while(num>0){
            int newNum= num%10;
            num = num/10;
            revNum = (revNum *10) + newNum;

        }
        if(revNum == x){
            return true;
        }else{
            return false;
        }
    }
}