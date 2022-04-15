package day34_deneme;

import day34_accessModifier_encapsulation.C01;

public class Deneme {

    // encapsule edecegimiz 2 variable olusturalim

    private int sayi;
    private String str;

    public int getSayi(){
        return sayi;
    }

    public String getStr(){return str;}

    public static void main(String[] args) {
        // C01 obj = new C01();
        // Const default access modifier'a sahip oldugundan
        // baska package'dan kullanilamaz
        C01.halkaAcikSayi = 13;

    }
}
