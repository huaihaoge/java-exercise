package com.haochh.chen.exerise.day3;

import java.util.Arrays;

/**
 * Created by admin on 2020/4/14.
 */
public class CompleteSquare {


    public static void main(String[] args) {

        System.out.println("args = " + sqrt(12));

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


}
