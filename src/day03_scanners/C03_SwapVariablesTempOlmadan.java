package day03_scanners;

public class C03_SwapVariablesTempOlmadan {

    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10

         */

        int sayi1 = 40;
        int sayi2=  30;

        System.out.println( "SWAP'tan once sayi1 :" + sayi1 + " sayi2 : " + sayi2);

        sayi1= sayi1+sayi2; //sayi1= 70
        sayi2= sayi1-sayi2; //sayi2= 40
        sayi1= sayi1-sayi2; //sayi1= 30

        System.out.println("SWAP'tan sonra sayi1 :" + sayi1 + " sayi2 : " + sayi2);






    }
}
