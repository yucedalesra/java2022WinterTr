package day04_dataCasting_Increment;

public class C02_autoWidening {
    public static void main(String[] args) {


    // boolean dogruMu = true;
    //String str = dogruMu;// sol String sag boolean olunca kabul etmez


        byte sayi1 = 44 ;
        System.out.println(sayi1);



        short sayi2 = sayi1;   // esitligin solu short sagi ise byte olmasina ragmen Java itiraz etmiyor
                              // deger olarak atanan veri turu variable data turunden kucuk oldugu icin java sorun yapmaz
                             // buna Auto Widening denir

        System.out.println(sayi2);


        double sayi3= sayi2;

        System.out.println(sayi3);  //44.0






    }
}
