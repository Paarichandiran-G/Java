package dsa;

import java.util.*;
class Array {
    private int[] arr;
    private int size;
    int capacity=16;
    Array() {
      arr=new int[capacity];
      size=0;
    }
    public void add(int val){
      if(size==capacity){
        expend();
      }
      arr[size++]=val;

    }
    public void expend(){
       capacity=capacity*2;
       arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void insert(int index,int element){
        if(size==capacity){
            expend();
        }
        for(int i=size-1; i>=index; i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        size++;
    }
    public void delete(int index){
        for(int i=index+1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
    }
}

public class arrayimplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array a = new Array();
        boolean b=true;
        while(b){
        System.out.println("1.add elements into  array");
        System.out.println("2.display elements");
        System.out.println("3.insert specified index");
        System.out.println("4.delete specified index");

        System.out.println("5.exit");
        int val = sc.nextInt();
        switch (val) {
            case 1:
                System.out.println("enter the elements");
                int v = sc.nextInt();
                a.add(v);
                break;
            case 2:
                a.display();
                break;
            case 3:
                System.out.println("enter the elements");
                int index = sc.nextInt();
                int element = sc.nextInt();
                a.insert(index, element);
                break;
            case 5:
                System.exit(0);

        }
    }

    }
}
