import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Type a number and find out its factorial");
            int x = sc.nextInt();
            System.out.printf("The factorial of %d is: %d\n", x, factorial(x));
        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage());
        }
    }

    private static int factorial(int x) {
        if (x == 1) {
            return 1;
        }

        return x * factorial(x - 1);
    }
}
