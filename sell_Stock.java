/**
 * Problem: Best Time to Buy and Sell Stock
 * 
 * Approach:
 * - Keep track of the minimum price (buy)
 * - Calculate profit at each step
 * - Store the maximum profit
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProfit(int[] prices) {
        int buy = prices[0];  // initial buying price
        int profit = 0;       // maximum profit

        for (int i = 1; i < prices.length; i++) {

            // update buy if we find a cheaper price
            if (prices[i] < buy) {
                buy = prices[i];
            }

            // check if selling today gives better profit
            else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }

        return profit;
    }

    // main method for testing
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
