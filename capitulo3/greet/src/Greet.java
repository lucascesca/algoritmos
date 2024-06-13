import java.util.InputMismatchException;
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Type a greeting:");
            String greeting = sc.nextLine();
            System.out.print("Now, type a name: ");
            String name = sc.nextLine();

            greet(greeting, name);
        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage());
        }
    }

    private static void greet(String... values) {
        String greeting = values[0];
        String name = values[1];
        System.out.println(greeting + ", " + name);
        greet2(name);

        System.out.println("getting ready to say bye...");

        bye(name);
    }

    private static void greet2(String name) {
        System.out.println("Nice to meet you, " + name);
    }

    private static void bye(String name) {
        System.out.println("Ok, bye, " + name + "!");
    }
}
