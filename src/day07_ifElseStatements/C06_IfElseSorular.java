package day07_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseSorular {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin




        //Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
        //calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin");

        int yas = scan.nextInt();
        if ( yas>=65 ){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emeklilik yasiniz henüz gelmedi");
            System.out.println(65-yas +" yil daha calismalisiniz");
        }


        //Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil” yazdirin.
    }
}
