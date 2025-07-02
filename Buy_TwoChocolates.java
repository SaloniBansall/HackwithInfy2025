/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saloni Bansal
 */
import java.util.Arrays;
import java.util.Scanner;

public class Buy_TwoChocolates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int idx = 0; idx < a.length; idx++) {
            a[idx] = sc.nextInt();

        }
        int money = sc.nextInt();
        Buy_TwoChocolates obj = new Buy_TwoChocolates();
        int ans = obj.buyChoco(a, money); // we have to make object if calling nonstatci method from static method
        // int ans=buyChoco(a,money); can use this line if the methid is static 
        System.out.println(ans);

    }

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int one = prices[0] < money ? prices[0] : 0;
        for (int i = 1; i < prices.length; i++) {
            if (one != 0 && one + prices[i] <= money) {
                return money - (one + prices[i]);
            } else {
                one = prices[i] < money ? prices[i] : 0;
            }
        }
        return money;

    }

}

// This code finds the maximum amount of money left after buying . // two chocolates from a given list of prices, ensuring that the total cost does not exceed the available money.
// It sorts the prices, checks combinations of the two cheapest chocolates, and returns the remaining money
// if a valid combination is found. If no valid combination exists, it returns the initial amount of money.
// Time Complexity: O(n log n) due to sorting the prices array.
