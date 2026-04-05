public class uc8 {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}