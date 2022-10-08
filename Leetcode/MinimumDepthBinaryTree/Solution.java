package MinimumDepthBinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {


    public static void main(String[] args) {
        var tn = new TreeNode(34);
        tn.right = new TreeNode(345);
        tn.right.left = new TreeNode(35);
        tn.right.right = new TreeNode(500);
        tn.left = new TreeNode(3);
        tn.left.right = new TreeNode(1);
        tn.left.left = new TreeNode(5);
        displayLevelOrder(tn);
        System.out.println("\nminDepth():" + minDepth(tn));
        System.out.println("\n");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        displayLevelOrder(root);
        System.out.println("\nminDepth():" + minDepth(tn));
    }

    static int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        Queue<QueueItem> treeNodeQueue = new ArrayDeque<>();

        QueueItem currentNode = new QueueItem(root, 1);

        treeNodeQueue.add(currentNode);

        while(!treeNodeQueue.isEmpty()){
            currentNode=treeNodeQueue.poll();
            TreeNode tn = currentNode.node;

            int depth = currentNode.depth;

            if(null == tn.right && null == tn.left){
                return depth;
            }
            if(null != tn.left){
                currentNode.node=tn.left;
                currentNode.depth=depth+1;
                treeNodeQueue.add(currentNode);
            }
            if(null != tn.right){
                currentNode.node=tn.right;
                currentNode.depth=depth+1;
                treeNodeQueue.add(currentNode);
            }
        }

        System.out.println("Harry Kim was here");
        return -1;
    }

    private static int levelOrder(TreeNode root) {

        return 0;
    }

    // https://www.geeksforgeeks.org/level-order-traversal-line-line-set-3-using-one-queue/
    static void displayLevelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();

        // Pushing root node into the queue.
        q.add(root);

        // Pushing delimiter into the queue.
        q.add(null);

        // Executing loop till queue becomes
        // empty
        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            // condition to check the
            // occurrence of next level
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            } else {
                // Pushing left child current node
                if (curr.left != null)
                    q.add(curr.left);

                // Pushing right child current node
                if (curr.right != null)
                    q.add(curr.right);

                System.out.print(curr.val + " ");
            }
        }
    }

    private static class QueueItem{
        TreeNode node;
        int depth;

        QueueItem(TreeNode node, int depth){
            this.node=node;
            this.depth=depth;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}