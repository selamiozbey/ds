package hackerRank;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
public class MoreLinkedList {
    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[]) throws FileNotFoundException {
        File fl = new File("D:\\SOLeetCode\\data\\MoreLinkedListTest.txt");
        Scanner sc=new Scanner(fl);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node tempNode = head;

        while(tempNode.next != null){
            if(tempNode.data == tempNode.next.data){
                tempNode.next = tempNode.next.next;
            }else
            tempNode = tempNode.next;
        }

        return head;
    }

}
