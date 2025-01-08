// package tree.tree;
import java.util.*;
class binarysearch{
    Node root;
    class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            right=left=null;
        }
    }
    binarysearch(int val){
       root=new Node(val);
    }
     void insert(int val){
       insert(root,val);
    }
    Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
      return root;
    }
     void Inorder(Node root){
       if(root!=null){
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
       }
    }
    void delete(int val){
        root=delete(root, val);
    }
    Node delete(Node root,int val){
        if(root==null){
            return root;
        }
        if(val<root.val){
            root.left=delete(root.left,val);
        }
        else if(val>root.val){
            root.right=delete(root.right,val);
        }
        else{
              if(root.left==null){
                return root.right;
              }
              else if(root.right==null){
                return root.left;
              }
              root.val=min(root.right);
              root.right=delete(root.right,root.val);
        }        
      return root;
    }
    int min(Node root){
        int minVal = root.val;
        while(root.left!=null){
            minVal = root.left.val;
            root=root.left;
        }
        return minVal;
    }
}
public class bst {
    public static void main(String[] args) {
        binarysearch b = new binarysearch(5);
        b.insert(10);
        b.insert(25);
        b.insert(90);
        b.insert(50);
        b.insert(60);
        b.insert(30);
        b.insert(80);
        b.insert(20);
        b.Inorder(b.root);
        b.delete( 5);
        System.out.println();
        b.Inorder(b.root);
    }
}
