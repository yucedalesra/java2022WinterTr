package day39_overriding;

public class Corolla extends Toyota {

    protected String hiz= "Corolla max 200 km hiz yapar";
   protected String yakit="Corolla benzini ya da elektriklidir";
    protected String model="Corolla";

    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        /*
        Data türü ve cons. farkli oldugunda
        cons. calsitigi icin obje
        cons.'un oldugu class ozelliklerini tasir
        ancak daha turu Parent class secildigi icin
        variable´lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir

        Method'lar icin ise yine data turunun oldugu class'a gideriz ancak
        direkt methodu calistirmadan once
        method override edilmis mi diye kontrol ederiz
         */

        Corolla araba1=new Corolla();
        System.out.println(araba1.hareket); // output araba class'indan
        System.out.println(araba1.hiz); // output corolla'dan
        System.out.println(araba1.yakit); // output corolla'dan
        System.out.println(araba1.marka); // output Toyota`dan
        System.out.println(araba1.mensei); // output parent olan Toyota'dan
        System.out.println(araba1.model); // output corolla'dan


        Toyota araba2=new Corolla();
        System.out.println(araba2.hareket); // output araba class'indan
        System.out.println(araba2.hiz); // output Toyota'dan
        System.out.println(araba2.yakit); // output araba'dan
        System.out.println(araba2.marka); // output Toyota`dan
        System.out.println(araba2.mensei); // output Toyota'dan
        // System.out.println(araba2.model); // CTE
        araba2.motor(); // Corolla
        araba2.garanti(); // Toyota
        araba2.yakitTuketimi();// Corolla
        // araba2.vitesSayisi(); // data türü olan Toyota'dan
        // baslayinca öyle bir method bulamadik CTE



        Araba araba3=new Corolla();
        System.out.println(araba3.hareket); // output araba class'indan
        System.out.println(araba3.hiz); // output araba class'indan
        System.out.println(araba3.yakit); // output araba class'indan
        System.out.println(araba3.marka); // output araba class'indan

        // System.out.println(araba3.mensei); // CTE
        // System.out.println(araba3.model); // CTE

        araba3.yakitTuketimi(); // Corolla
        araba3.motor(); // Corolla
        // araba3.garanti(); // CTE aramaya Araba class'indan baslar
        // araba3.vitesSayisi(); // CTE








    }
}
