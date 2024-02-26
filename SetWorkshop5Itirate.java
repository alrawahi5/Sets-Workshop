import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshop5Itirate{

    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();
        names.addAll(Arrays.asList("Apple", "Banana", "Cherry"));
        for (String x : names){
            System.out.println(x);
        }
    }
}