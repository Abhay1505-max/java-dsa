class Solution {
    int drink=0;
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
       while(numBottles>0){

         drink += numBottles; 
            empty += numBottles;

            numBottles = empty / numExchange; 
            empty = empty % numExchange;      
        
       } 
       return drink;
    }
}
