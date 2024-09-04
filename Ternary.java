public class Ternary {

    public static void main(String args[]) {

        String n = "1";

        String result;

        switch (n) {

            case "1", "7", "8" -> {
                result = "Monday";
            }
            case "2" -> result = "Tuesday";

            default -> {
                System.out.println("Enter a Valid Number");
                result = "Not Initialized";
            }

        }

        System.out.println(result);
        
    }
    
}
