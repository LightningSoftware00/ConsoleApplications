package GeneralReviewQuestionsSectionTwo;
import java.util.Scanner;


public class OneHunderedElementsRandom {
    public static void main(String[] args) {



        int gettingNumbers = getNumber();

        int numbersTotal = 0;
        int underAvarageNumberCount = 0;
        int oneHunderedElementsArray [] = new int[gettingNumbers];
        for (int index = 0;index<oneHunderedElementsArray.length;index++){
            oneHunderedElementsArray[index] = (int)(Math.random() *10) ;
            numbersTotal +=oneHunderedElementsArray[index];


        }

        double avarage =  (double)numbersTotal/gettingNumbers;

        for (int show : oneHunderedElementsArray){

            if (avarage>show){
                underAvarageNumberCount++;

            }

        }
        System.out.println("numbers of under the avarage counts are that : "+underAvarageNumberCount);
    }




    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please Enter A Number bigger than 0...");
        try {
            Thread.sleep(3000); // 3 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Terminali temizle (ANSI escape kodu)
        System.out.print("\033[H\033[2J");
        System.out.flush();


        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        while (input <= 0) {
            System.out.println("Invalid input. Enter a number bigger than 0: ");
            input = scanner.nextInt();
        }

        scanner.close();
        return input;
    }
}

