import java.util.Scanner;

public class factorial {
    public int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        factorial calculator = new factorial();
        int factorial = calculator.calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}