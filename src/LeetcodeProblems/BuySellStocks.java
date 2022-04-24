package LeetcodeProblems;
//leetcode no 121
//buy and sell stocks to return max profit
//buy date<sell date
//sell cannot be on same date as buy


import java.lang.*;
import java.util.*;
public class BuySellStocks {
    static int buySellStocks(ArrayList<Integer>A) {
        //find min
        //if A.get(i)-min is greater than maxprofit, make that the max profit

        int N=A.size();
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i=0; i<N; i++) {

            if (A.get(i)<minPrice) {
                minPrice=A.get(i);
            }

            else if ((A.get(i)-minPrice)>maxProfit) {
                maxProfit=A.get(i)-minPrice;
            }
        }
        return maxProfit;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        ArrayList<Integer>A=new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(buySellStocks(A));
    }
}
//TC is O(N), SC is O(1)
