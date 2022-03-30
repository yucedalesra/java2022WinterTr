package day18_nestedForLoop;

import java.util.Scanner;

public class C08_forLoopVsWhileLoop {
    public static void main(String[] args) {

        //kullanicidan toplmaak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        //kullanici 0'a bastiginda
        // girdigi tüm sayilarin toplamini yazdirin



        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam =0;

        /*
        for (int i = 1; i <=100000 ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();

            if (sayi==0){
                break;
            }else {
                toplam+=sayi;
            }
        }
        System.out.println(toplam);
        sayi=1;
        toplam=0;
         */



        while (sayi!=0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }

        //baslangic, bitis ve degisim degerlei net olan durumlarda
        //for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir

    }
}
