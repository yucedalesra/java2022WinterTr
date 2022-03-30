package day04_dataCasting_Increment;

public class C05_ornekSorular {
    public static void main(String[] args) {

       // Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        // birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi1 = 44;
        short sayi2 = sayi1;
        System.out.println(sayi2);
        int sayi3 = sayi2;
        System.out.println(sayi3);
        float sayi4 = sayi3;
        System.out.println(sayi4);
        double sayi5 = sayi4;
        System.out.println(sayi5);

      //  Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi6 = 50;
        double sayi7 = (int) sayi6;
        System.out.println(sayi7);




      //  Soru 3 ) Float data turunde bir variable olusturun ve yazdirin

        float numara1 = 7.234567f;
        System.out.println(numara1);


        // Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin
        double no1 = 255.36;
        int no2= (int)no1; //255
        System.out.println(no2);
        int no3= (byte) no2; //-1
        System.out.println(no3);

       // Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        int no4 = 30;
        int no5 = 60;
        System.out.println(no5/no4); //2

        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        int nu1 = 50;
        double nu2 = 25;
        System.out.println(nu1/nu2); // 2.0

        //Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim

        float bir = 2.123455f;
        double iki= 2;
        System.out.println(bir/iki); // 1.061727523803711


    }
}
