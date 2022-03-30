package day11_StringManipulation;

import java.util.Locale;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Esra Nur";
        String str2 = "Esra"+" Nur";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);


        System.out.println("== ile karsilastir " + (str1==str2));
        System.out.println("equals ile karsilastir " + str1.equals(str2));

        String str3= str1+"";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karsislastir " + (str3==str2));
        System.out.println("equals ile karsilastir " + str1.equals(str2));

        // String'de == her zaman dogru sonuc vermez
        // bunun icin emin oldugumuz equals method'unu kullanmayi tercih ederiz

        String str5 = "hasan";
        String str6 = "HASAN";

        System.out.println(str5.equals(str6)); //false
        System.out.println(str5.toUpperCase().equals(str6));



    }
}
