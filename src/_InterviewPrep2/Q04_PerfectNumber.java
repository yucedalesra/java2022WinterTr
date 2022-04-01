package _InterviewPrep2;

import java.util.Scanner;

import static day29_staticKeyword.C03.sayi;

public class Q04_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
     Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
     Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
     kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
     ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
        */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi =scan.nextInt();

        mukemmelSayi();
    }

    public static void mukemmelSayi() {
        int toplam=0;
        for (int i = 1; i <sayi; i++) {
            // 1den basliyor burada bolenleri kontrol edecegiz, sayi dahil olmadigi icin esit degil
            if (sayi%i==0){  // herhangi bir boleni varsa
                toplam+=i;
            }
        }
        if (toplam==sayi){
            System.out.println("mükemmel sayidir");
        }else System.out.println("mükemmel sayi degildir");
    }
}
