package dsa;
import java.util.*;
public class list{
   static  Node head;
    static Node tail;
    class Node{
       int data;
       Node next;
       Node(int val){
        data=val;
        next=null;
       }
    }
    list(){
        head=tail=null;
    }
    public  void insert(int val){
      Node newNode = new Node(val);
      if(head==null){
        head=newNode;
        tail=newNode;
      }
      else{
        tail.next=newNode;
        tail=newNode;
      } 
    }
    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    public void inserAtpos(int val,int pos){
        Node newNode =new Node(val);
        Node temp=head;
        Node prev=null;   
        if(pos==0){
            head=newNode;
            head.next=temp;
        }
        else{
            for(int i=0;i<pos;i++){
                prev=temp;
                temp=temp.next;
            }
            prev.next=newNode;
            newNode.next=temp;
        }
    }
    public void deletepos(int pos){
        Node temp=head;
        Node prev=null;

        if(pos==0){
            head=head.next;
        }
        else{
             for(int i=0;i<pos;i++){
                prev=temp;
                temp=temp.next;
             }
             prev.next=temp.next;     
        }
    }
    public void reverse(){
        
    }
public static void main(String[] args){
    list l=new list();
    l.insert(0);
    l.insert(1);
    l.insert(2);
    l.insert(3);
    l.insert(4);
    l.display();
    System.out.println();
    l.inserAtpos(5,5);
    l.display();
    System.out.println();
    l.deletepos(6);
    l.display();
    l.reverse();
}
}

