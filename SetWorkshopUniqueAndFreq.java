import java.lang.*;
import java.util.*;

public class SetWorkshopUniqueAndFreq {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        Set<Integer> numSet = new HashSet<Integer>();
        numList.addAll(Arrays.asList(1, 2, 3, 3, 1));
        numSet.addAll(numList);

        for (Integer setElement : numSet) {
            Integer count = 0;
            for(Integer listElement: numList) {
                if(setElement.equals(listElement)){
                    count++;
                }
            }
            System.out.println(setElement + " exists "
            + count + " times");
        }
        System.out.println("The List contains: " + numList);
        System.out.println("The set contains: " + numSet);
    }
}