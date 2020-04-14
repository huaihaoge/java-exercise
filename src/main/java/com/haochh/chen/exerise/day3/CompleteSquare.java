package com.haochh.chen.exerise.day3;


import static java.lang.Integer.min;

/**
 * Created by admin on 2020/4/14.
 */
public class CompleteSquare {


    public static void main(String[] args) {

        System.out.println("args = " + sqrt(12));

        System.out.println("args = " + calc(12));
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

    private static int calc(int x) {

        int res = x;
        int num = 2;

        while (num * num < x) {
            int a = x / (num * num);
            int b = x % (num * num);
            res = min(res , a + calc(b));
            ++num;
        }

        return res;
    }


}




