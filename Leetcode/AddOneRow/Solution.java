package AddOneRow;
/*

https://leetcode.com/problems/add-one-row-to-tree/

Given the root of a binary tree and two integers val and depth, add a row of nodes with value val at the given depth depth.

Note that the root node is at depth 1.

The adding rule is:

    Given the integer depth, for each not null tree node cur at the depth depth - 1, create two tree nodes with value val as cur's left subtree root and right subtree root.
    cur's original left subtree should be the left subtree of the new left subtree root.
    cur's original right subtree should be the right subtree of the new right subtree root.
    If depth == 1 that means there is no depth depth - 1 at all, then create a tree node with value val as the new root of the whole original tree, and the original tree is the new root's left subtree.



Example 1:

Input: root = [4,2,6,3,1,5], val = 1, depth = 2
Output: [4,1,1,2,null,null,6,3,1,5]

Example 2:

Input: root = [4,2,null,3,1], val = 1, depth = 3
Output: [4,2,null,1,1,3,null,null,1]



Constraints:

    The number of nodes in the tree is in the range [1, 104].
    The depth of the tree is in the range [1, 104].
    -100 <= Node.val <= 100
    -105 <= val <= 105
    1 <= depth <= the depth of tree + 1



 */


class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(null == root){
            return null;
        }
        if (depth > 2) {
            root.right = addOneRow(root.right, val, depth - 1);
            root.left = addOneRow(root.left, val, depth - 1);
        } else if (2 == depth) {
            var newRightNode = new TreeNode(val);
            var newLeftNode = new TreeNode(val);
            System.out.println(root.left);
            System.out.println(root.right);
            if(null!=root.right) {
                newRightNode.right = root.right;
                root.right = newRightNode;
            }
            if(null!=root.left) {
                newLeftNode.left = root.left;
                root.left = newLeftNode;
            }
        } else if (1 == depth) {
            var newRootNode = new TreeNode(val);
            newRootNode.left=root;
            return newRootNode;
        } else if (0 == depth) {
            var newRootNode = new TreeNode(val);
            newRootNode.right=root;
            return newRootNode;
        } else {
            System.out.println("Harry Kim was here");
        }
        return root;
    }


  public class TreeNode {
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