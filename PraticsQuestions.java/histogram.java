import java.util.*;
public class histogram {
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        String s="[2,1,5,6,2,3]";
        String s1=s.replace("[","").replace("]","");
        String[] str=s1.split(",");
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        for(int i=0;i<str.length;i++){
            int x=Integer.parseInt(str[i]);
            a1.add(x);
        }
        int y=0;
        for(int i=0;i<str.length;i++){
            y=0;
            for(int j=i;j>=0;j--){
                if(a1.get(i)<=a1.get(j))
                y++;
                else
                break;
            }
            for(int j=i+1;j<str.length;j++){
                if(a1.get(i)<=a1.get(j))
                y++;
                else
                break;
            }
            a2.add(y*a1.get(i));
        }
        Collections.sort(a2);
        System.out.print(a2.get(a2.size()-1));
    }
}
