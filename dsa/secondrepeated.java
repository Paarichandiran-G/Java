import java.util.*;
public class secondrepeated{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a=sc.next().toCharArray();
        LinkedHashMap<Character,Integer> tm=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
            tm.put(a[i],tm.getOrDefault(a[i],0)+1);
        }
        int v=Collections.max(tm.values());
        for(Character c :tm.keySet()){
           if(tm.get(c)==v){
            continue;
           }
           else{
            System.out.print(c);
            return;
           }
        }
      
    }
}
