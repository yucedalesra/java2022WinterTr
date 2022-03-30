package day18_nestedForLoop;

import java.util.Scanner;

public class C09_whileLoopAvantaj {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmasini isteyin
        // kullanicinin girdigi sayilarin toplami 500'ü gecerse
        // artik yater cok sayi girdin, toplam ... oldu yazsin


        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam =0;

        while (toplam<500){
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yater cok sayi girdin, toplam : "+toplam+ " oldu");
    }
}
