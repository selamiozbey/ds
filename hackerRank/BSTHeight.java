package hackerRank;

import Util.Node;

import java.util.LinkedList;
import java.util.Queue;

import static Util.Node.insert;

public class BSTHeight {

    public static void main(String args[]){
        int [] arr = {3, 5,2,1, 4, 6, 7};
        Node root=null;
        for (int i=0; i< arr.length; i++){
            int data=arr[i];
            root=insert(root,data);
        }
        int height= depth(root);//treeHeight(root);//nodeHeight(root);//getHeight(root);
        System.out.println(height);
    }

    public static int getHeight(Node node){
        //Write your code here
        if (node == null)
            return 0;
        else
        {
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    static int treeHeight(Node node)
    {
        // Base Case
        if (node == null)
            return 0;

        // Create an empty queue for level order tarversal
        Queue<Node> q = new LinkedList();

        // Enqueue Root and initialize height
        q.add(node);
        int height = 0;

        while (1 == 1)
        {
            // nodeCount (queue size) indicates number of nodes
            // at current lelvel.
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;

            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while (nodeCount > 0)
            {
                Node newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }
        }
    }

    static int currentDepth=-1, depth=-1;
    public static int depth(Node root) {
        if (root != null) {
            currentDepth++;

            // record total depth if current depth is greater than total depth
            if (currentDepth > depth) {
                depth = currentDepth;
            }

            // recursively traverse entire tree
            depth(root.left);
            depth(root.right);

            // decrement as we traverse up the binary tree
            currentDepth--;
        }
        return depth;
    }
}
