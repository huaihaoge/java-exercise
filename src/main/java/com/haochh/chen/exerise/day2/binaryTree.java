package com.haochh.chen.exerise.day2;


import java.util.Arrays;

public class binaryTree {

    public static void main(String[] args) {

        int[] preOrder = new int[]{3, 9, 20, 15, 7};

        int[] midOrder = new int[]{9, 3, 15, 20, 7};

        buildTree(preOrder, midOrder);

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        int val = preorder[0], i=0;
        TreeNode node = new TreeNode(val);
        while(inorder[i]!=val) i++;
        node.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
        node.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        return node;
    }

}
