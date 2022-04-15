package day42_exceptions;

import java.io.IOException;
import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) throws IllegalArgumentException {

        /*
        Kullanicidan yasini isteyin
        Kullanici yas olarak negatif bir sayi,
        0,
        120'den buyuk bir sayi girerse illegalArgumentException olusacak sekilde bir program yaziniz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas= scan.nextInt();

        if (yas<=0  || yas>120){
          //  System.out.println("Lütfen gecerli bir yas giriniz");
            // Java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();

        }else {
            System.out.println("Uygun yas girdiniz");
        }
    }
}
