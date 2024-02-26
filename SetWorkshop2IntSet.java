import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshop2IntSet{

    public static void main(String[] args) {

        Set<Integer> number = new HashSet<Integer>();
        number.addAll(Arrays.asList(1 , 2, 3, 4, 5));
        System.out.println("Printing the set with its size: " + "\nI have the following elements " + number + "and my size is " +number.size());
    }
}