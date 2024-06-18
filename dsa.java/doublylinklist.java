package dsa;
import java.util.*;
public class doublylinklist {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
    }
    doublylinklist(){
        head=null;
        tail=null;
    }
    public void insertAtbegin(int val){
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        doublylinklist d=new doublylinklist();
        d.insertAtbegin(1);
    }
}
