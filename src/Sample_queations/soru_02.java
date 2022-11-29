package Sample_queations;

import java.util.Scanner;

public class soru_02 {
    public static void main(String[] args) {

      //  Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
      //          -ismi daha uzun ise, isim ve soyismi ilk harf buyuk, kalanlar kucuk seklinde yazdirin
      //          -soyisim daha uzun ise ismi ilk harf buyuk, digerleri kucuk, soyismi buyuk harflerle yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminiz giriniz");
        String soyisim= scan.nextLine();

         int isiml=isim.length();
         int soyİsiml=soyisim.length();







    }
}
