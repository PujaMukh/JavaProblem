package trees;

import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val=x;           //constructor
        left=null;
        right=null;
    }

    //given a rootnode, find count of number of nodes
    public int solve(TreeNode A) {
        if (A==null) {      //break condition
            return 0;
        }
        int left=solve(A.left);
        int right=solve(A.right);
        return left+right+1;

    }

    //given a root node, find the count of nodes with more value than all of its ancestors
    public int solve1(TreeNode A) {
        return helper(A, Integer.MIN_VALUE);

    }
    public int helper(TreeNode n, int max) {
        int count=0;
        if (n==null) {
            return 0;  //break condition
        }
        if (n.val>max) {
            count=count+1;
            max=n.val;
        }
        count=count+helper(n.left, max);
        count=count+helper(n.right, max);
        return count;
    }
    //given root node, find height of tree. Height is number of nodes along longest path from
    //root node to farthest leaf node

    public int solve2(TreeNode A) {
        //we know how to calculate number of nodes in a tree. Use similar logic
        //ans will be 1(root node)+max of (left side of root, right side of root)

        if (A==null) {
            return 0;
        }
        int left=solve2(A.left);
        int right=solve2(A.right);
        return max(left,right)+1;
    }
    public int max(int left, int right) {
        if (left>right) {
            return left;
        }
        return right;
    }
    //inorder traversal using recursion (inorder is LDR)
    public ArrayList<Integer> inOrder(TreeNode A) {
        ArrayList<Integer>output=new ArrayList<>();
        if (A==null) {
            return output;
        }
        inOrder(A.left);
        output.add(A.val);
        inOrder(A.right);
        return output;
    }

    //preorder traversal using recursion (preorder is DLR)
    public ArrayList<Integer> preOrder(TreeNode A) {
        ArrayList<Integer>output=new ArrayList<>();
        if (A==null) {
            return output;
        }
        output.add(A.val);
        preOrder(A.left);
        preOrder(A.right);
        return output;
    }
    //postorder traversal using recursion (postorder is LRD)
    public ArrayList<Integer> postOrder(TreeNode A) {
        ArrayList<Integer>output=new ArrayList<>();
        if (A==null) {
            return output;
        }

        postOrder(A.left);
        postOrder(A.right);
        output.add(A.val);
        return output;
    }
    //given root nodes of 2 binary trees, check if both the trees are identical
    //trees are identical if it has same structure and same value
    public int solve3(TreeNode A, TreeNode B) {
        if (A==null && B!=null) {
            return 0;
        }
        if (A!=null && B==null) {
            return 0;
        }
        if (A==null && B==null) {
            return 1;
        }
        if (A.val!=B.val) {
            return 0;
        }
        int left=solve3(A.left, B.left);
        if (left==0) {
            return 0;
        }
        int right=solve3(A.right, B.right);
        if (right==0) {
            return 0;
        }
        return 1;

    }
    //inverting a binary tree (mirror image)
    public void mirror(TreeNode A) {
        if (A==null) {
            return;
        }
        TreeNode temp=A.left;
        A.left=A.right;
        A.right=temp;

        mirror(A.left);
        mirror(A.right);
    }

    //given a binary tree, you need to find the path from root node to given node in the tree
    ArrayList<Integer>output=new ArrayList<>();
    public ArrayList<Integer> findPath(TreeNode A, int B) {
        if (checkIf(A,B)==true) {
            return output;
        }
        return output;

    }
    public boolean checkIf(TreeNode A, int B) {
        if (A==null) {    //break condition
            return false;
        }
        output.add(A.val);
        if (A.val==B) {
            return true;
        }
        if (((checkIf(A.left, B)) || (checkIf(A.right, B)))==true) {
            return true;
        }
        if (((checkIf(A.left, B)) || (checkIf(A.right, B)))==false) {
            output.remove(output.size()-1);
        }
        return false;
    }

    //search for value B in binary search tree
    //special property of binary search tree- it will be sorted when inorder is applied (LDR)
    public boolean checkIfPresent(TreeNode A, int B) {
        while (A!=null) {
            if (A.val==B) {
                return true;
            }
            if (A.val>B) {
                A=A.left;  //because of inorder property of binary tree, data will be sorted
            }
            if (A.val<B) {
                A=A.right;
            }
        }
        return false;

    }
    //search for value B in binary tree using recursion
    public boolean check(TreeNode A, int B) {
        if (A==null) {
            return false;    //break condition
        }
        if (A.val==B) {
            return true;
        }

        if (A.val>B) {  //when inorder is applied on BST, it returns sorted nodes
            return check(A.left, B);
        }
        if (A.val<B) {
            return check(A.right, B);
        }

        return false;

    }
    //check if the given binary tree if symetric around its center, given its root node
    public int symetricTree(TreeNode A)  {
        if (checkIfSymetric(A,A)==true) {
            return 1;
        }

    return 0;
    }
    public boolean checkIfSymetric(TreeNode A, TreeNode B) {
        if (A==null && B==null) {
            return true;
        }
        if (A==null && B!=null) {
            return false;
        }
        if (B==null && A!=null) {
            return false;
        }
        if (A.val!=B.val) {
            return false;
        }
        return checkIfSymetric(A.left, B.right) && checkIfSymetric(A.right, B.left);

    }
    //given a range int B and int C and a binary search tree, count number of noes which falls
    //in the binary search tree range
    public int findNumberOfNodes(TreeNode A, int B, int C) {
        //binary search tree means if inorder traversal is done, the nodes will be sorted
        int count=0;
        if (A==null) {
            return 0; //break condition
        }
        if (A.val>=B && A.val<=C) {
            count=count+1;
        }
        int left=findNumberOfNodes(A.left, B, C);
        int right=findNumberOfNodes(A.right, B, C);
        return count+left+right;

    }






}
