import java.lang.*;
import java.util.*;

public class SetWorkshopDisjoint{

    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();
        num1.addAll(Arrays.asList(1, 2, 3));
        num2.addAll(Arrays.asList(7, 4, 5));
        boolean common = Collections.disjoint(num1, num2);
        if (common == true){
            System.out.println("Disjoint ");
        }
        else{
            System.out.println("Not Disjoint" );
        }
    }
}