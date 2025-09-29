package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;

public class XProgram{
    public static void main(String[] args) {
        Scanner get_key = new Scanner(System.in);

        System.out.println("Please enter number");
        int getting_key = get_key.nextInt();

        for (int i = 0;i<getting_key;i++){
            for (int j = 0;j<getting_key;j++){
                if(i == j || j == getting_key-i-1 ){
                    System.out.printf("x");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}