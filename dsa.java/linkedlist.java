package dsa;
import java.util.*;
public class linkedlist {
    Node head;
     class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
     }
     linkedlist(){
        head=null;
     }
     public void insertBiginning(int val){
           Node newNode=new Node(val);
           if(head==null){
            head=newNode;
           }
           else{
            newNode.next=head;
            head=newNode;
           }
     }
     public void insertAtpos(int pos,int val){
        Node newNode=new Node(val);
        Node temp=head;
        if(pos==0){
            insertBiginning(val);
            return;
        }
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;
     }
     public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
     }
     public void deletepos(int pos){
        if(pos==0){
            head=head.next;
            return;
        }
       Node temp=head;
       Node prev=null;
       for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
       } 
       prev.next=temp.next;
     }
     public void reverse() {
        if(head==null){
            return;
        }
        Node next=rev(head);
        next.next=null;


		// Node prev = null;
		// Node current = head;
		// Node next = head.next;
		
		// while(current!=null) {
		// 	next=current.next;
		// 	current.next = prev; //reverse link
		// 	prev = current;
		// 	current = next;
		// }
		
		// head = prev;
	}

    private Node rev(Node curr){
        if(curr.next==null){
            head=curr;
            return curr;
        }
        
        Node next=rev(curr.next);
        next.next=curr;
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist list=new linkedlist();
        list.insertBiginning(1);
        list.insertBiginning(2);
        list.insertAtpos(1,3);
        list.insertAtpos(2,4);
        list.display();
        list.deletepos(3);
        System.out.println();
        list.display();
        System.out.println();
        list.reverse();
        list.display();

    }
}
