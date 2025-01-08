// package graph;
import java.util.*;
public class dfs {
    public static ArrayList<Integer> s(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> al =new ArrayList<Integer>();
        boolean[] vis = new boolean[v];
        vis[0]=true;
        dfsGraph(0,vis,adj,al);
        return al;
    }
    public static void dfsGraph(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> al){
       vis[node]=true;
       al.add(node);
       for(Integer it:adj.get(node)){
        // System.out.println(it+" "+node+" "+vis.length);
        if(vis[it]==false){
            dfsGraph(it,vis,adj,al);
        }
       }
    }
 public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<6;i++){
        list.add(new ArrayList<Integer>());
    }
     list.get(0).add(1);
     list.get(0).add(3);
     list.get(1).add(2);
     list.get(2).add(3);
     list.get(3).add(4);
     list.get(4).add(5);
     System.out.println(list);
     System.out.println(s(6,list));

 }   
}
