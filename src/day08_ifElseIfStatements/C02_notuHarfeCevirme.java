package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_notuHarfeCevirme {
    public static void main(String[] args) {


        //Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50 < 60 arasi “C”,
        // =60 < 80 arasi “B”,
        // =80’nin uzerinde ise “A”

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double notSayi = scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("Lütfen gecerli bir not giriniz");
        }
        else if (notSayi < 50){
            System.out.println("notunuz D");
        } else if (notSayi>=50 && notSayi <60){
            System.out.println("notunuz C");
        } else if (notSayi >= 60 && notSayi<80){
            System.out.println("notunuz B");
        } else {
            System.out.println("notunuz A");
        }





    }
}
