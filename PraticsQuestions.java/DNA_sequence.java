import java.util.*;
public class DNA_sequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=s.length();
        LinkedHashMap<String,Integer> mp=new LinkedHashMap<String,Integer>();
        for(int i=0;i<k-9;i++){
            String sub=s.substring(i,i+10);
            mp.put(sub,mp.getOrDefault(sub,0)+1);
        }
        for(Map.Entry<String,Integer> pair:mp.entrySet()){
            if(pair.getValue()>1){
                System.out.println(pair.getKey());
            }
        }
    }
}