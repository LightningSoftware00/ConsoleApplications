package GeneralReviewQuestionsSectionTwo;
import java.util.Scanner;

public class GradeSystemSecTwo {
    public static void main(String[] args) {
        Scanner gettingNumber = new Scanner(System.in);

        System.out.println("Please Enter Number Of Students");
        int numberOfStudents = GetNumber(gettingNumber);

        System.out.println("Please Enter Number Of Questions");
        int numberOfQuestions = GetNumber(gettingNumber);


        char studentsAnswer[][] = new char[numberOfStudents][numberOfQuestions];


        Matrix(numberOfStudents, numberOfQuestions, studentsAnswer);


        char trueAnswers[] = new char[numberOfQuestions];


        TrueAnswer(trueAnswers, numberOfQuestions);


        AnswerComparation(trueAnswers, studentsAnswer, numberOfQuestions, numberOfStudents);

    }


    public static int GetNumber(Scanner gettingNumber) {
        return gettingNumber.nextInt();
    }


    public static void Matrix(int numberOfStudents, int numberOfQuestions, char studentsAnswer[][]) {
        char options[] = {'A', 'B', 'C', 'D', 'E'};
        for (int index = 0; index < numberOfStudents; index++) {
            for (int index2 = 0; index2 < numberOfQuestions; index2++) {
                int randomNumber = (int) (Math.random() * 5);
                studentsAnswer[index][index2] = options[randomNumber];
            }
        }
    }

    // Doğru cevapları rastgele atayan fonksiyon
    public static void TrueAnswer(char[] trueAnswer, int numberOfQuestions) {
        char options[] = {'A', 'B', 'C', 'D', 'E'};
        for (int index = 0; index < numberOfQuestions; index++) {
            int randomNumber = (int) (Math.random() * 5);
            trueAnswer[index] = options[randomNumber];
        }
    }

    // Doğru ve yanlış cevapları karşılaştıran fonksiyon
    public static void AnswerComparation(char trueAnswer[], char studentsAnswer[][], int numberOfQuestions, int numberOfStudents) {
        int totalCorrectAnswer = 0;
        int totalWrongAnswer = 0;

        // Her öğrencinin cevaplarını kontrol et
        for (int limit = 0; limit < numberOfStudents; limit++) {
            // Her soru için
            for (int index = 0; index < numberOfQuestions; index++) {
                if (trueAnswer[index] == studentsAnswer[limit][index]) {
                    totalCorrectAnswer++;
                } else {
                    totalWrongAnswer++;
                }
            }
        }

        // Sonuçları yazdır
        System.out.println("Correct answers: " + totalCorrectAnswer);
        System.out.println("Wrong answers: " + totalWrongAnswer);
    }
}
