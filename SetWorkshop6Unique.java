import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshop6Unique{
    public static void main(String[] args) {

        Set<Integer> number = new HashSet<Integer>();
        number.addAll(Arrays.asList(2, 4, 4, 5, 6));
        System.out.println("Printing the set with its elements: " + "\nI have the following elements " + number+"\n");
        System.out.println("Since my set contains some duplicated elements,4, " +
                "\nit removed the duplicate and returned one element of each");
    }
}