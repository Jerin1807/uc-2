public class uc5 {
    public static void main(String[] args) {

        // If no arguments → print default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}