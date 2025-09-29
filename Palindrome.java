package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner getNumbwer = new Scanner(System.in);

        System.out.println("Enter the word you want to know if it is a palindrome");
        String palindrome = getNumbwer.nextLine();

        int altSinir = 0;
        int ustSinir = palindrome.length() -1;
        boolean palindromeMu = true;

        while(altSinir<ustSinir) {
            if (palindrome.charAt(altSinir) != palindrome.charAt(ustSinir)) {
                palindromeMu = false;
                break;
            }
            altSinir++;
            ustSinir--;

            if(palindromeMu){
                System.out.println(palindrome+"kelimesi palindromedur.");
            }
        }

    }
}
