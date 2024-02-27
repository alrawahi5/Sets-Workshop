import java.lang.*;
import java.util.*;

public class SetWorkshopMVtheNotExsist{
        public static void main(String[] args) {
            Set<Integer> num1 = new HashSet<Integer>();
            Set<Integer> num2 = new HashSet<Integer>();
            num1.addAll(Arrays.asList(1, 2, 3));
            num2.addAll(Arrays.asList(1, 4, 5));
            boolean a = num1.retainAll(num2);
            System.out.println("Intesection element "+num1);
            num1.clear();
            System.out.println(num1);
        }
    }