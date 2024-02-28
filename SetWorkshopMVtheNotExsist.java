import java.lang.*;
import java.util.*;

public class SetWorkshopMVtheNotExsist{
        public static void main(String[] args) {
            Set<Integer> num1 = new HashSet<Integer>();
            Set<Integer> num2 = new HashSet<Integer>();
            num1.addAll(Arrays.asList(1, 2, 3));
            num2.addAll(Arrays.asList(1, 2, 3,4));
            System.out.println("The first set contains: " + num1);
            System.out.println("The second set contains: "+ num2);
            boolean a = num1.retainAll(num2);
            System.out.println("After removing the unique element\n in the second set, we get: "+num1);
        }
    }