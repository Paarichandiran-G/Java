import java.util.*;
public class Cstyleini {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1=str.replace(","," ").replace(";"," ");
        String[] s2=s1.split(" ");
        int x=0;
        int y=0;
        for(int i=0;i<s2.length;i++){
            String tem=s2[i];
            if(tem.equals("int")){
                if(x==0){
                System.out.println("Integers");
                }
                x++;
                continue;
            }
            if(tem.equals("char")){
                if(y==0){
                System.out.println("characters");
                }
                y++;
                continue;
            }
            if(tem.length()==1){
                System.out.println(tem+"=junk");
            }
            else{
                System.out.println(tem);
            }

        }
    }
}
