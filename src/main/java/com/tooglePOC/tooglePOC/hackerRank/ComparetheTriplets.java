package com.tooglePOC.tooglePOC.hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ComparetheTriplets {


    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */

        int[] res = new int[]{0,0};
        a0=a0-b0;
        a1=a1-b1;
        a2=a2-b2;

        if(a0!=0){
            if(a0>0){
                res[0]=res[0]+1;
            }else{
                res[1]=res[1]+1;
            }
        }

        if(a1!=0){
            if(a1>0){
                res[0]=res[0]+1;
            }else{
                res[1]=res[1]+1;
            }
        }

        if(a2!=0){
            if(a2>0){
                res[0]=res[0]+1;
            }else{
                res[1]=res[1]+1;
            }
        }

        return res;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Arrays.stream(solve(5,6,7,3,6,10)).forEach(x -> System.out.println(x));
    }
}
