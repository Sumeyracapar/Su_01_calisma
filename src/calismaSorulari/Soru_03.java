package calismaSorulari;

import java.util.Scanner;

public class Soru_03 {

   /* Soru-2)   SOUT/SYSO  Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
              Ipuclari:
            * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
            * Dikdortgenin Alani : uzun kenar * kisa kenar
       */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısa kenar ve uzun kenarını giriniz");
        double kisaKenar= scan.nextDouble();
        double uzunKenar= scan.nextDouble();
        System.out.println("Dikdörtgenin Cevresi: "+ 2*(uzunKenar+kisaKenar));
        System.out.println("Dikdörtgenin Alani : "+ (uzunKenar*kisaKenar));


    }
 }

