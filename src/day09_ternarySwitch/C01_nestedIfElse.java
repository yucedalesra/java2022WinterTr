package day09_ternarySwitch;

import java.util.Scanner;

public class C01_nestedIfElse {
    public static void main(String[] args) {

        //Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi>9999){ // istenmeyen durumu yaziyoruz

            System.out.println("Lutfen 4 basamakli bir sayi giriniz");

        } else if ( sayi%5 == 0){ // modulus(%) 5, 5 ile bölümünden kalani verir eger 0'a esitse 5'e tam bölünür

            if (sayi%10==0){ // 4 basamakli, 5 ile bölünebilen ve son rakami 0 olanlar
                System.out.println("5'e bölünebilen cift sayi");

            }else{// 4 basamakli, 5 ile bölünebilen ve son rakami 0 olmayan
                System.out.println("5'e bölünen tek sayi");
            }

        } else {//4 basamakli ve 5'e bölünemeyenler
            System.out.println("Lütfen tekrar deneyin");

        }





    }
}
