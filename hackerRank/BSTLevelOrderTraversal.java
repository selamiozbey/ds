package hackerRank;

import Util.Node;

import java.util.ArrayList;

import static Util.Node.insert;

public class BSTLevelOrderTraversal {

    public static void main(String args[]) {

        int[] arr = {3, 5, 4, 7, 2, 1};

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            root = insert(root, data);
        }
        levelOrder(root);
    }

    static ArrayList<Integer> array = new ArrayList();

    static void levelOrder(Node root) {
        //Write your code here
        array.add(root.data);
        ArrayList<Node> nodeArray = new ArrayList();
        nodeArray.add(root);
        while (!nodeArray.isEmpty()) {
            nodeArray = findAllFirstLevelChildren(nodeArray);
            for (Node n : nodeArray){
                array.add(n.data);
            }

        }
        for (int i : array){
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Node> findAllFirstLevelChildren(ArrayList<Node> nodeArray) {
        ArrayList<Node> nodeList = new ArrayList<>();
        for (Node n : nodeArray) {
            if (n.left != null) {
                nodeList.add(n.left);
            }
            if (n.right != null) {
                nodeList.add(n.right);
            }
        }
        return nodeList;
    }

}
