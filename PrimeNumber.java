package GeneralReviewQuestionsSectionOne;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        int totalPrimeNumber = 0; // Toplam asal sayı

        System.out.println("Enter a Number:");
        int gettingNumber = getNumber.nextInt();  // Girilen sayı

        // Asal sayıları toplamak için döngü
        for (int i = 2; i <= gettingNumber; i++) {
            boolean isPrime = true;

            // Asal sayıyı kontrol et
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Eğer i asal bir sayıdırsa, toplama ekle
            if (isPrime) {
                totalPrimeNumber += i;
            }
        }

        // Sonuçları yazdır
        System.out.printf("Total of Prime Numbers: %d\n", totalPrimeNumber);
    }
}
