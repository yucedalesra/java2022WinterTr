package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("girilen sayi cift sayidir");
        }
        if (sayi%2 != 2) {
            System.out.println("girilen sayi tek sayidir");

        }

        //normalde bir tamsayi ya tek ya da cifttir, ücüncü bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        //if else ile tek statement'da yapmak daha güzel olur
        // ================= if else ile cözüm ====================

        if (sayi%2 == 0) {
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }


    }
}
