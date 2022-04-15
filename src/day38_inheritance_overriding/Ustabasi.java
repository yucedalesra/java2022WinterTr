package day38_inheritance_overriding;

public class Ustabasi extends Isci{

    String statu="Ustabasi";

    String haklar="Ustabasi haftada bir gün ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa ustabasi ekstra ücret almadan calisir");
    }

    public void maasHesapla(){
        System.out.println("Ustabasi 30 gün*8 saat * 12 Euro = " + (30*8*12) + "Euro maas alir");
    }

    public static void main(String[] args) {
        /*
        Icinde oldugumuz class'dan klasik haliyle bir obje olusturursak o obje ile
        cagirdigimiz variable ve method#larda java once icinde bulundugumuz class'a bakar
        aradigimiz class uyesi icinde bulundugumuz class'da varsa
        bize onu getirir
        YOKSA,
        parent class'lara bakar ilk buldugunu getirir
         */

        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); // Ustabasi
        System.out.println(yasin.haklar); // Ustabasi haftada bir gün ekstra tatil hakkina sahiptir

        /*
        eger icsi olarak ozelliklerini gormek istersek
         */
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);
        System.out.println(ahmet.haklar);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);

    }
}
