package day15_methodCreation;

import java.util.Scanner;

public class C03_methodCreation {
    public static void main(String[] args) {

        // Kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3-4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun yazdirin"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayisi=kelime.length();

       if (harfSayisi<3){
           System.out.println("Kelime cok kisa");

       }else if (harfSayisi==3){
           ucHarfiTersineCevir(kelime);
       }else if (harfSayisi==4){
           dortHarfiTersineCevir(kelime);
       }else if (harfSayisi==5){
           besHarfiTersineCevir(kelime);
       }else {
           System.out.println("Kelime cok uzun");
       }
    }

    private static void besHarfiTersineCevir(String kelime) {
      String  tersKelime= kelime.substring(4)+
                kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayisi : 5" );
        System.out.println("Kelimenin tersten yazilisi : " + tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("Kelimenin tersten yazilisi : " + tersKelime);
    }

    private static void ucHarfiTersineCevir(String kelime) {
     String   tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println("Kelimenin tersten yazilisi : " + tersKelime);
    }

    // 1- method olusturmak icin method'un adini yazariz
    // 2- method'a giderken götürmem gereken variable varsa, bunu method'a eklemeliyim
    
}
