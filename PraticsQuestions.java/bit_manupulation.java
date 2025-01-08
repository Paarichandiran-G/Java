import java.util.ArrayList;
import java.util.List;
public class bit_manupulation {
    public static void main(String[] args) {
        // Create a list of lists
        List<List<Integer>> listOfLists = new ArrayList<>();
        // System.out.println(listOfLists);
        // System.out.println(listOfLists);
        
        // Create individual lists
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        // System.out.println(listOfLists);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        // System.out.println(listOfLists);
        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        
        // System.out.println(listOfLists);
        // Add individual lists to the list of lists
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        
        System.out.println(listOfLists.get(0));
        // Iterate through the list of lists and print each element
        for (List<Integer> list : listOfLists) {
            for (Integer number : list) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
