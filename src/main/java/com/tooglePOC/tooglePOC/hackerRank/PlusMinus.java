package com.tooglePOC.tooglePOC.hackerRank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;


public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */

        BigDecimal pos= BigDecimal.valueOf(Arrays.stream(arr).filter(x->x>0).count());
        BigDecimal neg= BigDecimal.valueOf(Arrays.stream(arr).filter(x->x<0).count());
        BigDecimal zero =  BigDecimal.valueOf( Arrays.stream(arr).filter(x->x==0).count());



        BigDecimal arrayLengt= BigDecimal.valueOf(arr.length);

        System.out.println(pos.divide(arrayLengt,6,RoundingMode.HALF_UP));
        System.out.println(neg.divide(arrayLengt,6,RoundingMode.HALF_UP));
        System.out.println(zero.divide(arrayLengt,6,RoundingMode.HALF_UP));


    }


    public static void main(String[] args) {
        plusMinus(new int[]{-4,3,-9,0,4,1});
    }


}
