import java.lang.*;
import java.util.*;

public class SetWorkshopUniqueAndFreq{
    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();
        num1.addAll(Arrays.asList(1, 2, 3, 3));
        for(int i = 0; i<num1.size(); i++) {
            num2.addAll(Arrays.asList(num1.get(i)));
            if(num1.get(i) == i){
                System.out.println(i + " is a duplicate element");
            }
        }
        System.out.println("The List contains: " + num1);
        System.out.println("The set contains: "+ num2);
    }
}