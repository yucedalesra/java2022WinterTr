package day05_matematikselIslemler;

public class C02_PreIncreamentPostIncreament {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;


        sayi2 = sayi1++; // sayi1 artirilacak (sonra)
                        // sayi 2´ye deger atanacak (once)

        System.out.println(sayi1 + " , " + sayi2 + " , " +sayi3); // 11,10,30


        sayi3 = ++sayi1; //once sayi1 1 artacak => sonra sayi3´e deger atayacak

        System.out.println(sayi1 + " , " + sayi2 + " , " +sayi3 ); // 12,10,12


        System.out.println( sayi3 ++); //12 once yazdiracak sonra artiracak
        System.out.println(sayi3); // 13 once 12 yazdiracak, sonra sayi3 = 13


        System.out.println(--sayi2); // once azalt sonra yazdir
                                    // once sayi2=9 sonra sayi2´nin son degeri yani 9 yazdirir


    }
}
