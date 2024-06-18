import java.util.*;
public class squarefreenumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                al.add(i);
            }
        }
        al2.addAll(al);
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            int a=al.get(i)*al.get(i);
            int r=al.indexOf(a);
            if(r==-1){
                continue;
            }
            else{
                for(int j=0;j<al2.size();j++){
                    if(al2.get(j)%a==0){
                        al2.remove(j);
                        --j;
                    }
                }
            }
        }
        // String r="abc";
        // String t="abc";
        // if(r==t){
        //     System.out.print("true");
        // }
        // else{
        //     System.out.println("false");
       // }
          System.out.println(al2.size());

    }
}