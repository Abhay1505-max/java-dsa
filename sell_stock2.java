/**
 * Problem: Best Time to Buy and Sell Stock II
 * 
 * Approach:
 * - Traverse the array
 * - Whenever price increases, add the difference to profit
 * - This simulates buying on previous day and selling on current day
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;  // total profit

        for (int i = 1; i < prices.length; i++) {

            // if price increases, take the profit
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
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
