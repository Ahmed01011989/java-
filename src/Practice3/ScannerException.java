package Practice3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerException {
    // FIXME : to be confirmed
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert first number : ");
        int a = scanner.nextInt();
        int b;
        System.out.println("insert second number : ");
        try {
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            b = scanner.nextInt();
            System.out.println("please try again to insert second integer : ");
        }

        int c = a + b;
        System.out.println("total is : " + c);
    }
}
