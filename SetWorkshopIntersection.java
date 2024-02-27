import java.lang.*;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshopIntersection{

    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();
        num1.addAll(Arrays.asList(1, 2, 3));
        num2.addAll(Arrays.asList(1, 4, 5));
        boolean a = num1.retainAll(num2);
        System.out.println("Intesection element "+num1);
    }
}