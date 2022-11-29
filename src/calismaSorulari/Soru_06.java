package calismaSorulari;

import java.util.Scanner;

public class Soru_06 {


   /* Soru 5-)  Kullanıcıdan karenin kenar uzunluğunu alın.
               Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
               Ipuclari:
               Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)


 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kenar uzunlugunu giriniz");

        int kenar=18;

        System.out.println("Karenin Alani = " + kenar*kenar );
        System.out.println("Karenin Cevresi = "+ 4*kenar);

    }
}

