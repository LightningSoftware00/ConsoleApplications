package GeneralReviewQuestionsSectionOne;

public class numberTotals {
    public static void main(String[] args) {
        int artis = 0;
        boolean artiyorMu = true;
        int total = 0;

        // 1'den 35'e kadar olan sayıları işleyen döngü
        for (int i = 1; i < 36; i = i + artis) {


            if (artis <= 4 && artiyorMu == true) {
                artis++;

                if (artis == 5) {
                    artiyorMu = false;
                }
            } else {

                artis--;

                if (artis == 1){
                    artiyorMu = true;
                }
            }


            total += i;
        }


        System.out.println("Toplam: " + total);
    }
}
