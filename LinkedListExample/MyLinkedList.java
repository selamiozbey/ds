package net.LinkedListExample;


public class MyLinkedList<E> {
    MyNode<E> head = null;
    MyNode<E> tail = null;
    private int size = 0;


    public void addHead(E data) {
/*        if (head == null) {
            head = new MyNode<>(data);
            head.nextNode = null;
            tail = head;
        } else {
            MyNode node = new MyNode(data);
            node.nextNode = head;
            head = node;
        }
        size++;*/
        addWithPos(data,0);
    }

    public void addTail(E data) {
        if (tail == null) {
            tail = new MyNode(data);
            head = tail;
        } else {
            tail.nextNode = new MyNode(data);
            tail = tail.nextNode;
        }
        size++;
    }

    public void add(E data) {
        if (head == null) {
            addWithPos(data,0);
        } else {
            addTail(data);
        }
    }

    public void addWithPos(E data, int pos) {
        if (head == null ) {
            head = new MyNode<>(data);
            head.nextNode = null;
            tail = head;
        } else if (pos == 0){
            MyNode node = new MyNode(data);
            node.nextNode = head;
            head = node;
        }else {
            MyNode node = head;

            for (int i = 0; i < pos-1; i++) {
                if (node.nextNode == null) {
                    break;
                } else {
                    node = node.nextNode;
                }
            }

            MyNode tNode = new MyNode(data);
            tNode.nextNode = node.nextNode;
            node.nextNode = tNode;

        }
        size++;
    }

    public void deleteHead() {
        if (head == null) {
            return;
        }
        if (head.nextNode == null) {
            head = null;
            tail = null;
        } else {
            head = head.nextNode;
        }

        size--;
    }

    public void deleteTail() {
        if (tail == null) {
            return;
        }
        if (head.nextNode == tail) {
            tail = head;
            head.nextNode = null;
        } else {
            MyNode node = head;
            while (node.nextNode != tail) {
                node = node.nextNode;
            }
            tail = node;
            tail.nextNode = null;
        }
        size--;
    }

    public void displayList() {
        MyNode node = head;
        if (node != null) {
            System.out.println(node.data + " ");
        }
        while (node.nextNode != null) {
            System.out.println(node.nextNode.data + "  ");
            node = node.nextNode;
        }
    }

    public int getSize() {
        return size;
    }

}
