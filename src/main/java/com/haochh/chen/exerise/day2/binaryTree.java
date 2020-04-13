package com.haochh.chen.exerise.day2;

import javafx.util.Pair;

public class binaryTree {

    /*
    树的结构示例：
              1
            /   \
          2       3
         / \     / \
        4   5   6   7
    */

    public static void main(String[] args) {

        int[] binaryTree = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        printPreBinaryTree(binaryTree);
        printMidBinaryTree(binaryTree);

    }

    private static void printPreBinaryTree(int[] preOrder) {

        Pair<Integer, Integer> treeInfo = calcTreeInfo(preOrder);

        for (int i = 0; i < treeInfo.getKey(); i++) {
            if (i % 2 == 1) {

            }
        }


        System.out.println(treeInfo.getKey());
        System.out.println(treeInfo.getValue());


    }

    private static void printMidBinaryTree(int[] midOrder) {


    }

    private static Pair<Integer, Integer> calcTreeInfo(int[] tree) {
        double treeHeight = Math.ceil(Math.log(tree.length + 1) / Math.log(2));
        double treeWidth = Math.pow(2.0, treeHeight);
        return new Pair<Integer, Integer>((int) treeHeight, (int) treeWidth - 1);
    }


}
