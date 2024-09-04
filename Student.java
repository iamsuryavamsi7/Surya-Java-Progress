class Studen{

    int rollno;
    String name;
    int marks;

    @Override
    public String toString() {
        return "Studen [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

}

public class Student {
    
    public static void main(String args[]) {

        Studen s1 = new Studen();
        s1.name = "Surya";
        s1.rollno = 61;
        s1.marks = 88;

        Studen s2 = new Studen();
        s2.name = "Vinay";
        s2.rollno = 79;
        s2.marks = 67;

        Studen s3 = new Studen();
        s3.name = "Andaman";
        s3.rollno = 175;
        s3.marks = 97;

        Studen students[] = new Studen[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for ( Studen studen: students) {

            System.out.println(studen);

        }

    }
    
}
