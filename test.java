/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class InTrav {

    public List<Integer> inorderTra(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelp(root, result);
        return result;
    }

    private void inorderHelp(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderHelp(node.left, result);    
            result.add(node.val);                
            inorderHelp(node.right, result);   
        }
    }
    

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InTrav tree = new InTrav();
        List<Integer> output = tree.inorderTra(root);
        System.out.println(output); 
    }
}