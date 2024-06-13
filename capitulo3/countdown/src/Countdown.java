import java.util.InputMismatchException;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Type a number to count down to one: ");
            int i = sc.nextInt();
            regressive(i);
        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage() + ": Please, type only Natural Numbers");
        }
    }

    private static void regressive(int i) {
        System.out.println(i);

        if (i <= 1)
            return;
        else
            regressive(i - 1);
    }
}
