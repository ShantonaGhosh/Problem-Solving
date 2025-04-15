package com.mycompany.binarytreepath;

import com.mycompany.binarytreepath.BinaryTreePath.TreeNode;
import java.util.ArrayList;
import java.util.List;

public  class BinaryTreePath {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

     public static List<String> binaryTreePath(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        helper(root, "", res);
        return res;
    }
    
    public static void helper(TreeNode root, String path, List<String> res){
        if(root.left == null && root.right==null) {
            res.add(path + root.val);
        }
        if(root.left !=null){
            helper(root.left, path+root.val + "->", res);
        }
        if(root.right !=null){
            helper(root.right, path+root.val + "->", res);
        }
        
    }

    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        // Call the binaryTreePath function to get the paths
        List<String> paths = binaryTreePath(root);

        // Print the list of paths
        System.out.println("Binary Tree Paths:");
        for (String path : paths) {
            System.out.println(path);
        }
        System.out.println("Hello World!");
    }
}
