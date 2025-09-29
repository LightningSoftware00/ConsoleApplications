package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;

public class Heart {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int bomboclat = getNumber.nextInt();


        int width = bomboclat;


        for (int i = width / 2; i <= width; i += 2) {

            for (int j = 1; j < width - i; j += 2) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("o");
            }


            for (int j = 1; j <= width - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("o");
            }

            System.out.println();
        }


        for (int i = width; i >= 0; i--) {
            for (int j = i; j < width; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("o");
            }

            System.out.println();
        }
    }
}
