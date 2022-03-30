package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {

        // bilgisayara  1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi büyüt veya kücült diye kullaniciya yol gösterin
        // kullanici sayiyi buldugunda kac tahinde sayiyi buldugunu kullaniciya yazdirin


        Random rnd =new Random();
        int sayi=rnd.nextInt(100); // burasi 100`den kücük rastgele bir sayi olusturur

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while (sayi!= tahmin){
            System.out.println("Lütfen bir sayi giriniz");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kücük bir sayi söylemelisin");
            }else if (tahmin<sayi){
                System.out.println("Daha büyük bir sayi soylemelisin");

            }
            sayac++;

        }
        System.out.println("Tuttugum sayiyi " + sayac + " tahminde buldunuz");



    }
}
