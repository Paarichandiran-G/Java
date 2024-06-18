import java.util.*;
public class stack1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        Stack<Integer> yt=new Stack<Integer>();
        int temp=0;
        for(int i=0;i<n;i++){
            int choice=sc.nextInt();
            if(choice==1){
                temp=sc.nextInt();
                st.push(temp);
                if(yt.empty() || yt.peek()<=temp){
                    yt.push(temp);
                }
            }
            if(choice==2){
                temp=st.pop();
                if(temp==yt.peek()){
                    yt.pop();
                }
            }
            if(choice==3){
                if(st.empty()){
                    System.out.println("Stack is Empty");
                }
                else{
                    System.out.println(yt.peek());
                }
            }
        }
    }
}