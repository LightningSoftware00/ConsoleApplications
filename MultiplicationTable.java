package GeneralReviewQuestionsSectionOne;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Sütun başlıkları
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\t%2d", i);
        }
        System.out.println("\n--------------------------------------------");

        for (int j = 1; j <= 10; j++) {
            System.out.printf("%2d |", j); // Satır başlığı
            for (int i = 1; i <= 10; i++) {
                System.out.printf("\t%2d", i * j);
            }
            System.out.println();
        }
    }
}
