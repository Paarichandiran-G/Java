import java.util.*;
public class arraylist {
    static ArrayList<Integer> find(int a[],int target,int index,ArrayList<Integer> l){
        if(a[index]==target){
            l.add(index);
        }
        if(index==a.length-1){
            return l;
        }
        return find(a,target,index+1,l);
    }
static ArrayList<Integer> findall(int a[],int target,int index){
    ArrayList<Integer> l=new ArrayList<Integer>();
    if(a[index]==target){
        l.add(index);
    }
    if(index==a.length-1){
        return l;
    }
    ArrayList<Integer>ans= findall(a,target,index+1);
    l.addAll(ans);
    return l;
}
    public static void main(String[] args){
      //  Scanner sc=new Scanner(System.in);
        int[] a={1,2,4,5,5,6};
        int target=5;
        ArrayList<Integer> l=new ArrayList<Integer>();
        System.out.println(find(a,target,0,l));
        System.out.println(findall(a,target,0));
    }
}
