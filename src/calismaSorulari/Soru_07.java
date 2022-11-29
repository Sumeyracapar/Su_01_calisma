package calismaSorulari;

import java.util.Scanner;

public class Soru_07 {

    /*Soru 1 : Kullanicidan bir cumle alin
         - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim"
         yazdirin*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String  str= scan.nextLine();


        if (str.contains("ev") && str.contains("is")) {
            System.out.println("hem ev lazim hem is");

        }else if (str.contains("ev")&&!str.contains("is")) {
            System.out.println("home home sweet home");
        } else if (str.contains("is")) {
            System.out.println("calısmak guzeldir");

        }else if ((!str.contains("ev") && !str.contains("is"))){
            System.out.println("cok calisman lazım");


       }
       }


        }

            








