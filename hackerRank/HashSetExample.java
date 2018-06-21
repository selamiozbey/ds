package hackerRank;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;


public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Book> set=new HashSet<Book>();
        //Creating Books
        Book b1=new Book(105,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet
        fonk();
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }


    static class Book {
        int id;
        String name,author,publisher;
        int quantity;
        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }
    }

    static void fonk(){
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}