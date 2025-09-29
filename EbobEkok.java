package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        System.out.println("enter first number");
        int firstNumber = getNumber.nextInt();

        System.out.println("enter second number");
        int secondNumber = getNumber.nextInt();

        int ebob = 1;
        int control = 2;
        while (control <= firstNumber && control <= secondNumber) {
            if (firstNumber % control == 0 && secondNumber % control == 0) {
                ebob = control;
            }
            control++;
        }
        if (ebob == 1){
            System.out.println(firstNumber+" ve "+secondNumber+"aralarinda asaldir");
        }else{
            System.out.println(firstNumber+" ve "+secondNumber+"sayilarinin en buyuk ortak degeri : "+ebob);
        }
    }
}