import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshop4CheckPresence {

    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();
        names.addAll(Arrays.asList("Abdullah" , "Oman", "Samail"));
        System.out.println(" Checking if ~Abdullah~ exists --> " + names.contains("Abdullah"));
    }
}