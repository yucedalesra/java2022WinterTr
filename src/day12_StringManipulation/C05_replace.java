package day12_StringManipulation;

public class C05_replace {

    public static void main(String[] args) {

        String str= "Bugun ne cok ogrendik";

        //bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println("space haric karakter sayisi : " + str.replace(" ", " "));

        // atama yapilmadigi surece orijinal String kalici olarak degismez
        //sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur
        System.out.println("orijinal str karakter sayisi : " +str.length());

        // str da kalici degisiklik yapalim
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz

        str=str.replace("bugun", "yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : " + str);

        str.replace("ne cok", "ne az");





    }
}
