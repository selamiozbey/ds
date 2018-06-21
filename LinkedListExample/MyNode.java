package net.LinkedListExample;

public class MyNode<E> {

    protected E data;
    protected MyNode nextNode;

    public MyNode(E d){
        data =d;
        nextNode=null;
    }

    protected MyNode(){}

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public MyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode nextNode) {
        this.nextNode = nextNode;
    }

}
