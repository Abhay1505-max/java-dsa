/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. 
The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
🪙
🪙 🪙
🪙 🪙 __
in this case return  complete stages
*/
class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return n;
        }
       int i=1;
       long result=0;
       while(result<n){

    result=result+i;
    if(result==n){
        return i;
    }
    if(result>n){
        return i-1;
        
    }
    i++;
       } 
       return i-1;
    }
}
