package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {


        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "  Kadin icin K Erkek icin E harfini giriniz");

        char cinsiyet = scan.next() .toUpperCase() .charAt(0);


        System.out.println(" Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet == 'K'){

            if (yas<0 || yas>120){
                System.out.println("Lütfen girdiginiz yas degerini kontrol edin");
            } else if (yas<60){
                System.out.println("Emekli olamazsiniz Daha " + (60-yas) + "yil calismaniz gerekir");

            }


        } else if (cinsiyet == 'E'){
            if (yas<0 || yas>120){
                System.out.println("Lütfen girdiginiz yas degerini kontrol edin");
            } else if (yas<65){
                System.out.println("Emekli olamazsiniz Daha " + (60-yas) + "yil calismaniz gerekir");


            }else {

                System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
            }

        }

    }
}
