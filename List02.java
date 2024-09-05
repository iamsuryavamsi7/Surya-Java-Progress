
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02{

    public static void main(String args[]) {

        List<Integer> nums = new ArrayList<>();

        nums.add(48);
        nums.add(51);
        nums.add(14);
        nums.add(23);

        Collections.sort(nums);

        System.out.println(nums);

    }

}