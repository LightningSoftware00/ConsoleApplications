package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        int total = 1;
        boolean anyInput = false;

        while (true) {
            System.out.print("Enter number (0 to exit): ");
            int gettingNumber = getNumber.nextInt();

            if (gettingNumber == 0) {
                if (!anyInput) {
                    System.out.println("Result: 0");
                } else {
                    System.out.printf("Result: %d\n", total);
                }
                System.out.println("Exiting the system...");
                break;
            }

            total *= gettingNumber;
            anyInput = true;
        }
    }
}
