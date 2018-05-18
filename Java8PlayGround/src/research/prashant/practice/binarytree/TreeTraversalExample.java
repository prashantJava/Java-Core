package research.prashant.practice.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prashant_tripathi on 5/17/18.
 */

public class TreeTraversalExample {

    TreeNode root;

    public void addNode(int key, String name){
        TreeNode newNode = new TreeNode(key,name);

        if(root == null){
            root=newNode;
        }
        else{
            TreeNode currentNode = root;
            TreeNode parentNode;

            while(true){
                parentNode = currentNode;
                if(key<currentNode.key){
                    currentNode = currentNode.left;

                    if(currentNode == null){
                        parentNode.left = newNode;
                        return;
                    }
                }
                else{
                    currentNode = currentNode.right;
                    if(currentNode == null){
                        parentNode.right = newNode;
                        return;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeTraversalExample tree= new TreeTraversalExample();
        tree.addNode(100, "Senior Manager");
        tree.addNode(80, "Manager");
        tree.addNode(110, "Arctitect");
        tree.addNode(200, "abcd");
        tree.addNode(60, "developer");
        tree.addNode(50, "tester");
        tree.addNode(40,"user");


        Solution sol = new Solution();

        List<Integer> intList = sol.inorderTraversal(tree.root);
        System.out.println("inorderTraversal"+ intList);
        System.out.println("=============================");
        System.out.println();

        List<Integer> intpreList = sol.preOrderTraversal(tree.root);
        System.out.println("preOrderTraversal"+ intpreList);
        System.out.println("=============================");
        System.out.println();

        List<Integer> intpostList = sol.postOrderTraversal(tree.root);
        System.out.println("postOrderTraversal"+ intpostList);
        System.out.println("=============================");
        System.out.println();
    }



    public TreeNode getTree() {
        // TODO Auto-generated method stub
        TreeTraversalExample tree= new TreeTraversalExample();
        tree.addNode(100, "Senior Manager");
        tree.addNode(80, "Manager");
        tree.addNode(70, "Arctitect");
        tree.addNode(200, "Solution Arctitect");
        tree.addNode(60, "developer");
        tree.addNode(50, "tester");
        tree.addNode(40,"user");


        return root;
    }

}

class Solution {
    List<Integer> inList =new ArrayList();
    List<Integer> preList =new ArrayList();
    List<Integer> postList =new ArrayList();


    public List<Integer> inorderTraversal(TreeNode root) {

        if(root!=null){
            inorderTraversal(root.left);
            inList.add(root.key);
            System.out.println("##INORDER TRAVESAL ### "+root.key + "  " +root.name);
            inorderTraversal(root.right);
        }
        return inList;
    }

    public List<Integer> preOrderTraversal(TreeNode root) {

        if(root!=null){
            preList.add(root.key);
            System.out.println("##PREORDER TRAVESAL ### "+root.key + "  " +root.name);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        return preList;
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            postList.add(root.key);
            System.out.println("##POSTORDER TRAVESAL ### "+root.key + "  " +root.name);
        }
        return postList;
    }
}

class TreeNode {
    int key;
    String name;
    TreeNode left;
    TreeNode right;
    TreeNode(int x, String name){
        key = x;
        this.name =name;
    }

    public String toString(){
        return name + " has key  "+key;

    }
}