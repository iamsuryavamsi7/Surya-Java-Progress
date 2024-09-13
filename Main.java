
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class Main{

    public static void main(String[] args) {

        Comparator<Integer> com = (Integer i, Integer j) -> i % 10 > j % 10 ? 1 : -1;

        List<Integer> nums = new ArrayList<>();

        nums.add(55);
        nums.add(61);
        nums.add(38);
        nums.add(94);

        Collections.sort(nums, com);

        System.out.println(nums);

        Comparator<String> com1 =(String i, String j) ->  i.length() > j.length() ? 1: -1;

        List<String> nums1 = new ArrayList<>();

        nums1.add("Surya");
        nums1.add("Gokul");
        nums1.add("Kusuma");
        nums1.add("Krishna");

        Collections.sort(nums1, com1);

        System.out.println(nums1);

        Comparator<Student> com2 =(Student i, Student j) ->  i.age > j.age ? 1: -1;

        List<Student> nums2 = new ArrayList<>();

        nums2.add(new Student(21, "Surya"));
        nums2.add(new Student(27, "Gokul"));
        nums2.add(new Student(59, "Krishna"));
        nums2.add(new Student(53, "Kusuma"));

        Collections.sort(nums2, com2);

        for ( Student student : nums2 )

            System.out.println(student);

    }

}