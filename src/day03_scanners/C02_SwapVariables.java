package day03_scanners;

public class C02_SwapVariables {

    public static void main(String[] args) {

        // 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir  program yaziniz
        //Orn : sayi1=10 ve sayi2=20;
        //kod calistiktan sonra
        //sayi1=20 ve sayi2=10


        int sayi1=10;
        int sayi2=20;

        System.out.println( " Swap'dan once sayi1: "  + sayi1 + " sayi2 " + sayi2);


        // 1.adimda bos bir variable olusturup
        // sayi1´i ona atayalim

        int temp= sayi1;

        // 2.adimda sayi 1'e yeni degerini atayalim

        sayi1=sayi2;

        // 3.adimda sayi 2'ye temp'e yedekledigimiz degeri atayalim

        sayi2=temp;

        System.out.println("Swap'dan sonra sonra sayi1: " + sayi1 + "sayi2" + sayi2);
    }
}
