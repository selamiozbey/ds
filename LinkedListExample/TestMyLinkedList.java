package net.LinkedListExample;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add("alper");
        ll.add("merve");
        ll.add("ali");
        ll.add("veli");

        ll.add("sule");
        ll.add("ahmet");
        ll.add("recep");
        ll.add("selami");
        ll.add("yusuf");
        ll.displayList();


        ll.deleteHead();
        System.out.println("after head deletion the number of element is " + ll.getSize());
        ll.displayList();
        ll.deleteTail();
        System.out.println("after tail deletion the number of element is " + ll.getSize());
        ll.displayList();
        ll.addHead("TOYOTA");
        System.out.println("after head addition the number of element is " + ll.getSize());
        ll.displayList();
        ll.addTail("CAMRY");
        System.out.println("after tail addition the number of element is " + ll.getSize());
        ll.displayList();

        ll.addWithPos("LEXUS", 3);
        System.out.println("after  additionWithThePos the number of element is " + ll.getSize());
        ll.displayList();

        ll.addWithPos("999999999", 11);
        System.out.println("after  additionWithThePos the number of element is " + ll.getSize());
        ll.displayList();


    }
}


/*

A linked list is a sequence of data structures, which are connected together via links.

Linked List is a sequence of links which contains items. Each link contains a connection to another link.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
Java LinkedList class can be used as list, stack or queue.


* Array vs. Linked List
In general, array is considered a data structure for which size is fixed at the compile time and array memory is allocated
either from Data section (e.g. global array) or Stack section (e.g. local array).
Similarly, linked list is considered a data structure for which size is not fixed and memory is allocated from
Heap section (e.g. using malloc() etc.) as and when needed. In this sense, array is taken as a static data structure
 (residing in Data or Stack section) while linked list is taken as a dynamic data structure (residing in Heap section).

Following are the points in favour of Linked Lists.

(1)	The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally,
the allocated memory is equal to the upper limit irrespective of the usage, and in practical uses, upper limit is rarely
reached.

(2)	Inserting a new element in an array of elements is expensive, because room has to be created for the new elements and
to create room existing elements have to shifted.

For example, suppose we maintain a sorted list of IDs in an array id[].

id[] = [1000, 1010, 1050, 2000, 2040, …..].

And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000
(excluding 1000).

Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[],
everything after 1010 has to be moved.

So Linked list provides following two advantages over arrays
1)	Dynamic size
2)	Ease of insertion/deletion

Linked lists have following drawbacks:
1)	Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do
binary search with linked lists.
2)	Extra memory space for a pointer is required with each element of the list.
3) Arrays have better cache locality that can make a pretty big difference in performance.


*
*
*
* */