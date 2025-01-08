import java.util.*;
public class comparable implements Comparable<comparable> {
        
     String player;
     String runs;
     int hundreds;

    public comparable(String player, String runs, int hundreds) {
        this.player = player;
        this.runs = runs;
        this.hundreds = hundreds;
    }
    public String toString() {
        return "[ playerName --> "+player+" | runScored --> "+runs+" | hundreds --> "+hundreds+" ]";
    }
    public int compareTo(comparable h) {
        if(this.hundreds<h.hundreds){
            return 1;
        }
        else if(this.hundreds==h.hundreds){
            return 0;
        }
        else{
            return -1;
        }
        
    }
    
    public static void main(String[] args) {
        List<comparable> list = new ArrayList<comparable>();
        list.add(new comparable("Rohit Sharma","19587",48));
        list.add(new comparable("Sachin Tendulkar","32455",100));
        list.add(new comparable("Virat Kholi","26789",80));
        Collections.sort(list);
        for(comparable c: list){
            System.out.println(c);
        }
    }

}
        