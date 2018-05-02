package com.tooglePOC.tooglePOC.hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AVeryBigSUm {


    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
      return   Arrays.stream(ar).reduce(0,(a,b)->a+b);

    }


    public static void main(String[] args) {


        long[] var = new long[]{1000000001, 1000000002 ,1000000003, 1000000004 ,1000000005};


        System.out.println(aVeryBigSum(5,var));
    }

}
