package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;
public class HotCold {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        int oneToOneHunderded = (int) (Math.random() * 100 + 1);
        int attempts = 0;

        int enterNumber;
        do {

            attempts++;
            System.out.println("please enter a value to find the random number ");
            enterNumber = getNumber.nextInt();

            if (enterNumber > oneToOneHunderded) {
                System.out.println("Decrease");
            } else if (enterNumber < oneToOneHunderded) {
                System.out.println("Increase");
            } else {
                System.out.printf("Congruculations. your attempts : %d ",attempts );
            }

        } while (oneToOneHunderded != enterNumber);


    }
}
