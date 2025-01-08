// package graph;


import java.util.*;
public class bfs {
    static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean vis[] =new boolean[v];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(2);
        vis[2]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            // System.out.println("bfs "+bfs);                //[0,1,2]
            for(Integer it:adj.get(node)){
                System.out.println(it+" it  -->"+adj.get(node));
                if(vis[it]==false){
                    vis[it]=true;
                    System.out.println("boolean  "+vis[it]);
                    q.add(it);
                } 
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // int n= sc.nextInt();
        for(int i=0;i<5;i++){
            list.add(new ArrayList<Integer>());
        }
        // int e = sc.nextInt();
        // for(int i=0;i<e;i++){
        //     int src = sc.nextInt();
        //     int dest = sc.nextInt();
        //     list.get(src).add(dest);
        // }
                         //node 
        list.get(0).add(1);
        // list.get(0).add(2);
        list.get(1).add(2);
        // list.get(1).add(0);
        list.get(2).add(3);
        // list.get(2).add(1);
        list.get(3).add(4);
        list.get(4).add(1);
        System.out.println(list);
        System.out.println();
        System.out.print(bfs(5,list));
    }
}
