package day16_methodCreation;

public class C03_overloading {
    public static void main(String[] args) {

        // verilen 2 ssayiyi toplayip yazdiran bir method olusturalim

        int sayi1= 10;
        int sayi2= 20;

        ikiSayiTopla(sayi1, sayi2);

        // iki double sayinin toplamini yazdiran bir method olusturalim

        double sayi3= 15.2;
        double sayi4= 10.3;

        ikiSayiTopla(sayi3 , sayi4);

        // eger variable olusturmadan direkt sayilari yazarak method call yaparsam

        ikiSayiTopla(15,25); // int toplami verir

        ikiSayiTopla(10.1, 12.3); // double toplam verir


        //bir int ile bir double toplamini yazdiran bir method olusturalim
        int sayi5 = 3;
        double sayi6 = 3.2;

        ikiSayiTopla(sayi5,sayi6);



    }
    public static void ikiSayiTopla(int sayi3, double sayi4) {

        System.out.println("bir integer bir double toplami : " + (sayi3+sayi4));
    }



    public static void ikiSayiTopla(double sayi3, double sayi4) {

        System.out.println("iki double toplami : " + (sayi3+sayi4));
    }



    public static void ikiSayiTopla(int sayi1, int sayi2) {

        System.out.println("iki integer toplami : " + (sayi1+sayi2));
    }
}
