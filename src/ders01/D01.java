package ders01;

import java.util.Scanner;

public class D01 {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen urun adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("Lütfen lıste fıyatını gırınız");
        double lısteFıyatı= scan.nextDouble();

        System.out.println("Musteri kartiniz var mi?  \nE:Evet \nH: Hayir");
        char kartVarmı=scan.next().charAt(0);

        if (kartVarmı=='E' && urunAdedi>10){
            System.out.println("%20 indirimli toplam fiyati :"+ urunAdedi*lısteFıyatı*0.80);
        } else if (kartVarmı=='E'&& urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyati : "+ urunAdedi*lısteFıyatı*0.85);

         if (kartVarmı=='H' && urunAdedi>10){
             System.out.println("%15 indirimli toplam fiyati : "+urunAdedi*lısteFıyatı*0.85);
         } else if (kartVarmı=='H'&& urunAdedi>0) {
             System.out.println("%10 indirimli toplam fiyati :" + urunAdedi*lısteFıyatı*0.90);

         }else System.out.println("Hatali ürün");
        }


    }
}
