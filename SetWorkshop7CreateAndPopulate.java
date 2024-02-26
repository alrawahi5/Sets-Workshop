import java.lang.*;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
public class SetWorkshop7CreateAndPopulate{
    public static void main(String[] args) {

        Set<Integer> number = new HashSet<Integer>();
        number.addAll(Arrays.asList(1, 2, 3, 4,5));
        System.out.println("My original set has the following: " + number);
    }
}