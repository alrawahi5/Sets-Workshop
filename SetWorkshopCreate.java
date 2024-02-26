
import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshopCreate {

    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();
        names.addAll(Arrays.asList("Abdullah" , "Oman", "Samail"));
        System.out.println("Printing the set with its size: " + "\nI have the following elements " + names + "and my size is " +names.size());
        names.clear();
        System.out.println("After clearing, my size is: " + names.size());
    }
}
