package com.haochh.chen.exerise.day1;

import java.util.Arrays;
import java.util.Comparator;


/**
 * Created by admin on 2020/4/12.
 */
public class IntervalsMerging {

    public static void main(String[] args) {

        int[][] a = new int[][]{{1, 2}, {3, 4}, {5, 6}, {2, 5}, {1, 6}, {7, 10}};
        System.out.println("args = " + Arrays.deepToString(intervalMering(a)));

    }


    private static int[][] intervalMering(int[][] intervals) {

        intervals = sort(intervals);

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0] && intervals[i][1] <= intervals[i + 1][1]) {
                int[][] tmpArray = copyMering(intervals, i);
                tmpArray[i][0] = intervals[i][0];
                tmpArray[i][1] = intervals[i + 1][1];
                intervals = sort(tmpArray);
                i = i - 1;
            } else if (intervals[i + 1][1] >= intervals[i][0] && intervals[i + 1][1] <= intervals[i][1]) {
                int[][] tmpArray = copyMering(intervals, i);
                tmpArray[i][0] = intervals[i][0];
                tmpArray[i][1] = intervals[i][1];
                intervals = sort(tmpArray);
                i = i - 1;
            } else {
                continue;
            }
        }


        return intervals;
    }

    private static int[][] sort(int[][] intervals) {

        Arrays.sort(intervals,
                new Comparator<int[]>() {
                    public int compare(int[] o1, int[] o2) {
                        if (o1[0] == o2[0]) return o1[1] - o2[1];
                        return o1[0] - o2[0];
                    }
                });
        return intervals;

    }

    private static int[][] copyMering(int[][] intervals, int index) {

        int[][] tmpArray = new int[intervals.length - 1][2];

        for (int i = 0; i < tmpArray.length; i++) {
            if (i >= index) {
                tmpArray[i][0] = intervals[i + 1][0];
                tmpArray[i][1] = intervals[i + 1][1];
            } else {
                tmpArray[i][0] = intervals[i][0];
                tmpArray[i][1] = intervals[i][1];
            }
        }

        return tmpArray;

    }


}
