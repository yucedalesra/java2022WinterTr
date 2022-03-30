package day02_Variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Alper";

        ogrenciIsmi="Mistik";

        System.out.println(ogrenciIsmi);

        // Bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        // Ancak declare edilen bir Variable tekrar Declare edilemez

        String isim,soyisim,yas;

        isim="Esra";
        soyisim="Yucedal";
        yas="26";

        System.out.println(yas);
        System.out.println(isim);
        System.out.println(soyisim);

        String tcNo="12345678919";
        System.out.println(tcNo);

        //String non-primitive oldugu icin biz sadece data saklamak degil
        //ekstra bazi ozelliklerini de kullanabiliyoruz
        //eger tc no veya telefon numarasi gibi
        //kendisi sayisal olan ancak matematiksel bir islemde kullanulmayan degerler icin de String kullanilabilir


        String harf= "M";
        char harf2= 'M';

        // Bu ikisi icin de ayni durum gecerli
        // ben M harfi icin bir variable´i char olarak da olusturabilirim String olarak da olusturabilirim
        // Eger sadece saklayacaksak char kullanilabilir
        // ancak String'in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir


    }
}
