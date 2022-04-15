package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {

        // kulanicidan 2 sayi alip bolerek
        // sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while (kontrol!=2){


        System.out.println("Bölmek istediginiz sayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Kaca bolmek istediginizi yaziniz");
        int sayi2= scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1/sayi2);
            } catch (Exception e) {
               // e.printStackTrace();
            }
            System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basiniz");
            kontrol= scan.nextInt();

        }

        /*
        Sayi2 0 oldugunda sayi1/0 tanimsiz olacGINDAN
        Java bu durumla karsilasinca exception verir
        Javanin yazdigi mesajda exc. ne tür bir sorun oldugunu
        neden kaynaklandigini
        ve hangi satirda olustugunu yazar
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at day_overriding_polymorphism.C03_Exceptions.main(C03_Exceptions.java:16)

	    bunu cözebilmek icin sayi2'yi if ile kontrol edebiliriz



	    ama bu yöntem her sorunda calismaz

         */


    }
}
