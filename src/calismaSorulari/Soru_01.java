package calismaSorulari;

public class Soru_01 {
    public static void main(String[] args) {

        // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : "15.30 €" , input2 : "11.40 €"
        // Output : 26.70 €

         String input1="15.30 ";
         String input2="11.40 ";
         String fiyatCinsi="€";

        Double fiyatString1=Double.parseDouble(input1);
         System.out.println(input1);

         double fiyatString2=Double.parseDouble(input2);
         System.out.println(input2);
         System.out.print((fiyatString1+fiyatString2) + (fiyatCinsi));


    }
}
