package LittleProjects;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sayiAl = new Scanner(System.in);

        int systemNumberGenerator = 0;
        systemNumberGenerator = (int)(Math.random() *90)+10;

        int systemNumberGeneratorFirst = systemNumberGenerator/10;
        int systemNumberGeneratorSecond = systemNumberGenerator%10;

        System.out.println("PLEASE GUESS THE NUMBER");
        int enterNumber = sayiAl.nextInt();

        int enteredNumberFirst = enterNumber/10;
        int enteredNumberSecond = enterNumber%10;



        if(enterNumber == systemNumberGenerator){
            System.out.printf("YOU WON 10.000 TRY THE NUMBER WAS THAT : %d",systemNumberGenerator);
        }else if ((enteredNumberFirst == systemNumberGeneratorSecond) && (enteredNumberSecond ==systemNumberGeneratorFirst)){
            System.out.printf("YOU WON 5000 TRY THE NUMBER WAS THAT : %d",systemNumberGenerator);
        }else if(enteredNumberFirst == systemNumberGeneratorFirst || enteredNumberFirst == systemNumberGeneratorSecond || enteredNumberSecond == systemNumberGeneratorFirst || enteredNumberSecond == systemNumberGeneratorSecond){
            System.out.printf("YOU WON 1000 TRY THE NUMBER WAS THAT : %d",systemNumberGenerator);
        }else{
            System.out.printf("YOU LOST THE NUMBER WAS THAT : %d",systemNumberGenerator);
        }

    }
}
