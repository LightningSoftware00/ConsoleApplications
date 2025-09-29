package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;
public class TriangleVariety {
    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        System.out.println("Enter First Edge");
        int firstEdge = getNumber.nextInt();

        System.out.println("Enter Second Edge");
        int secondEdge = getNumber.nextInt();

        System.out.println("Enter Third Edge");
        int thirdEdge = getNumber.nextInt();

        if (firstEdge + secondEdge <= thirdEdge ||
                firstEdge + thirdEdge <= secondEdge ||
                secondEdge + thirdEdge <= firstEdge) {
            System.out.println("This is NOT a valid triangle!");
        }
        else if (firstEdge == secondEdge && secondEdge == thirdEdge) {
            System.out.println("Equilateral");
        } else if (firstEdge == secondEdge || firstEdge == thirdEdge || secondEdge == thirdEdge) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
