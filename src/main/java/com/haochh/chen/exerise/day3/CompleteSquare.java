package com.haochh.chen.exerise.day3;


import static java.lang.Integer.min;

/**
 * Created by admin on 2020/4/14.
 */
public class CompleteSquare {


    public static void main(String[] args) {

        System.out.println("args = " + sqrt(999));

        System.out.println("args = " + numSquares(999));
    }


    private static int i = 0;


    private static double sqrt(double x) {

        i++;
        double tmp = Math.floor(Math.sqrt(x));
        if ((tmp == 0) || (x - Math.pow(tmp, 2) == 0)) {
            return i;
        } else {
            return sqrt(x - Math.pow(tmp, 2));
        }

    }


    private static int numSquares(int n) {
        int res = n, num = 2;
        while (num * num <= n) {
            int a = n / (num * num), b = n % (num * num);
            res = min(res, a + numSquares(b));
            ++num;
        }
        return res;
    }
}




