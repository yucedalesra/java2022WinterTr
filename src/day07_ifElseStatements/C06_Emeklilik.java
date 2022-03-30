package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        //kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kücükse emekli olamazsin yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");

        int yas = scan.nextInt();
        if ( yas>=65 ){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsin");
            System.out.println(65-yas + "sene daha calismalisin");
        }

        //if else statementlerde iki durumdan sadece ve sadece biri calisir
        //ikisinin birden calisma ihtimali =====> YOK
        //ikisinin de calismama ihtimali ======> YOK


    }
}
