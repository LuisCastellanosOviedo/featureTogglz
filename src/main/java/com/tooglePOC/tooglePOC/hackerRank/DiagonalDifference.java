package com.tooglePOC.tooglePOC.hackerRank;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int cont=0;
        int cont2 =0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(i==j){
                    cont+=a[i][j];
                }

                if(i+j==a.length-1){
                    cont2+=a[i][j];
                }
            }
        }

        int res = cont-cont2;

        return res>0?res:res*-1;
    }






    public static void main(String[] args) {
        int a[][]= new int[3][3];

        a[0][0]=11;
        a[0][1]=2;
        a[0][2]=4;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=10;
        a[2][1]=8;
        a[2][2]=-12;




        diagonalDifference(a);

    }
}
