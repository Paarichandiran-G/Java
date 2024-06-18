import java.util.*;
public class sumString {
    public static void main(String[] args){
     //   Scanner sc=new Scanner(System.in);
        String s="342abc12a2aaa12";
        int sol=0;
        for(int i=0;i<s.length();i++){
            String str="0";
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                if(c>='0'&& c<='9'){
                    str=str+c;
                }
                else{
                    i=j;
                    // i--;
                    break;
                }
            }
            int a=Integer.parseInt(str);
            sol=sol+a;
        }
        System.out.print(sol);
    }
}
