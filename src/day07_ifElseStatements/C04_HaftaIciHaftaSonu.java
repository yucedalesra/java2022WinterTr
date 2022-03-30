package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

         //  Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek:  gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> haftasonu
        //pazartesi veya sali, carsamba, persembe, cuma ise ===> haftaici


        //String CaseSensitive'dir
        //yani pazar, PAZAR, PAzar, Pazar hepsi farklidir

        //bu durumda String methodlarindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase(); //kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");


         {
             if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                     gunIsmi.equals("persembe") || gunIsmi.equals("cuma"))
                System.out.println("girdiginiz gun haftaici");
            }

            }



    }
}
