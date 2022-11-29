package calismaSorulari;

import java.util.Scanner;

public class Soru_04 {

    /*Soru 3-) Kullanicidan 5 tane sayi alin,
               bu sayilarin ortalamasini hesaplayan
               java kodunu yaziniz.
               Ipuclari:
               Sayilarin ortalamasi: toplam/5
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 tane sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double sayi3= scan.nextDouble();
        double sayi4= scan.nextDouble();
        double sayi5= scan.nextDouble();

        System.out.println(sayi1+sayi2+sayi3+sayi4+sayi5/5);
    }




}
