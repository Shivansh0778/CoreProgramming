public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length of string: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: String is null.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Calling method that throws NullPointerException:");
        System.out.println("\nCalling method with exception handling:");
        handleNullPointerException();
    }
}

