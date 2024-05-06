import java.util.*;

import java.util.Map;
import static java.lang.Math.sqrt;

public class stock {
    public static void main(String[] args) {
        int price[] = { 7,1, 5, 3, 6, 4 };
        System.out.println(buysell(price));

    }

    static int buysell(int price[]) {
        // int buy = Integer.MAX_VALUE;
        // int maxprofit = 0;

        // for (int i = 0; i < price.length; i++) {
        //     if (buy < price[i]) {
        //         //System.out.println(buy);

        //         int profit = price[i];
                

        //         maxprofit = Math.max(maxprofit, profit);
                // System.out.println(maxprofit);
        //     }

        //     else {
        //         buy = price[i];

        //     }
        // }
        // return maxprofit ;
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < price.length; i++) {
            if(buy<price[i]){
                int profit=price[i];
                maxprofit=Math.max(maxprofit,price[i]-profit);

            }
            else{
                buy=price[i];

            }
        }

   return maxprofit;
   

    }
}
