package BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/binary-tree-inorder-traversal/

    Given the root of a binary tree, return the inorder traversal of its nodes' values.

    Example 1:

    Input: root = [1,null,2,3]
    Output: [1,3,2]

    Example 2:

    Input: root = []
    Output: []

    Example 3:

    Input: root = [1]
    Output: [1]

    Constraints:

        The number of nodes in the tree is in the range [0, 100].
        -100 <= Node.val <= 100

Recursive solution :

    public List<Integer> inorderTraversal(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        if (null == root.left && null == root.right) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            return list;
        }
        var returnList = new ArrayList<Integer>();
        if (null != root.left) {
            returnList.addAll(inorderTraversal(root.left));
        }
        returnList.add(root.val);
        if (null != root.right) {
            returnList.addAll(inorderTraversal(root.right));
        }
        return returnList;
    }

Recursive solution is trivial, do it with Morris Traversal
    https://www.youtube.com/watch?v=wGXB9OWhPTg

 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        //inorder tree traversal without the use of recursion or stack
        return morrisTraversal(root);
    }

    public List<Integer> morrisTraversal(TreeNode root) {
        var returnList = new ArrayList<Integer>();
        TreeNode current = root;
        while (current != null) {
            if (null == current.left) {
                returnList.add(current.val);
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != current && predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                if (null == predecessor.right) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    returnList.add(current.val);
                    current = current.right;
                }
            }
        }
        return returnList;
    }

    public class TreeNode {
        int val;
        TreeNode left;  // smaller or equal to val
        TreeNode right; // larger or equal to val

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

