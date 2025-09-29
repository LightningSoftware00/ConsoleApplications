package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;

public class UniversityPassingGrade {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int grade1 = 0; //midterm
        int grade2 = 0; //final

            System.out.println("Please enter your midterm grade : ");
            int midtermGrade = getNumber.nextInt(); // GETTİNG TOTAL EXAM GRADE FOR MİDTERM


            if (midtermGrade <= 100 && midtermGrade >= 0) {

                grade1 = midtermGrade;
            } else {
                System.out.println("Wrong entering .");
                System.exit(0); // it provide to exit program
            }


        System.out.println("Please enter your final grade : ");
        int finalGrade = getNumber.nextInt(); // GETTİNG FİNAL EXAM GRADE
        if(finalGrade<=100 && finalGrade >= 0){
            grade2 = finalGrade;
        }else {
            System.out.println("Wrong entering . ");
            return; // it provide to exit program
        }

        double allOfExamResults = ((grade1*0.40)+(grade2*0.60)) ;

        if(allOfExamResults >= 50){
            System.out.println("According to exam results you passed.\n***Congrulations ***");
        }else {
            System.out.println("According to exam results you failed .\nYou should study more than before ");
        }

    }
}
