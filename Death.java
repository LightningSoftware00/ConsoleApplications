package LittleProjects;
import java.util.Scanner;

public class Death {
    public static void main(String[] args) {

        Scanner evetHayir = new Scanner(System.in);
        int karakterCan = 100;


        System.out.printf(" ** KARAKTER CAN : %d ** ",karakterCan);

        do {
            System.out.println("\nCanavar saldırsın mı ? [E/H] ");
            String secimStr = evetHayir.next().toUpperCase(); //  Kullanıcının girdisini büyük harfe çeviriyoruz
            char secim = secimStr.charAt(0); //İlk harfi alıyoruz

            if(secim == 'E'){
                System.out.println("Saldırı Altındasınız [-10 CAN]");
                karakterCan -= 10;
                System.out.printf("Mevcut Can : %d ",karakterCan);
            }
            else if(secim == 'H'){
                System.out.println("Saldırıyı Savuşturdunuz");
                System.out.printf("Mevcut Can : %d ",karakterCan);
            }else{
                System.out.println("yanlış tuş girişi ! Lütfen sadece 'E' veya 'H' giriniz.");
            }
        }while(karakterCan > 0);

        System.out.println("Karakter öldü. Oyun bitti.");
        evetHayir.close();





    }
}
