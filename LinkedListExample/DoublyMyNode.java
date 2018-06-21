package net.LinkedListExample;

public class DoublyMyNode<E> extends MyNode {

    protected MyNode prevNode;

    public DoublyMyNode (E data){
        this.data = data;
        nextNode = null;
        prevNode = null;
    }

    public MyNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(MyNode prevNode) {
        this.prevNode = prevNode;
    }
}
