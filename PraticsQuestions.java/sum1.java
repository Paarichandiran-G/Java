import java.util.*;
public class sum1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String s="Hello World";
        // System.out.println("Length:"+s.length());
        // if(s.isEmpty()){
        //     System.out.println("Empty? true");
        // }
        // else{
        //     System.out.println("Empty? false");
        // }
        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());
        String s=sc.next();
        char[] c=s.toCharArray();
        int k=s.length()-1;
        for(int i=0;i<c.length;i++){
         if(c[i]=='a'||c[i]=='e'||c[i]=='o'||c[i]=='i'||c[i]=='u'){
                while(c[k]!='a'&&c[k]!='e'&&c[k]!='o'&&c[k]!='i'&&c[k]!='u'){
                 k--;
                }
                char t=c[i];
                c[i]=c[k];
                c[k]=t;
                k--;
                if(i>=k){
                 break;
                }
         }
        }
        System.out.print(Arrays.toString(c));
    }
}
