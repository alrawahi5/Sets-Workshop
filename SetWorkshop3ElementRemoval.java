import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshop3ElementRemoval{

    public static void main(String[] args) {

        Set<Integer> number = new HashSet<Integer>();
        number.addAll(Arrays.asList(1 , 2, 3, 4, 5));
        System.out.println("Printing the set: " + "\nI have the following elements " + number);
        number.remove(3);
        System.out.println("and and after removing the element 3, my set is " +number);

    }
}