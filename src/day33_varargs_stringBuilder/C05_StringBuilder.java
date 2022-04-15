package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        /*
        Compare 2 s.b.'yi esit mi diye
        ilk harften baslayarak tüm karakterleri karsilastirir.
        ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ASCII tablosuna gore kac deger geride veya ileride
        oldugunu yazdiri

        bir sb ile bir stringi compare etmek istersek Java CTE verir
         */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");
        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2)); // 0

        //  sb`de equals methodu Stringdeki == gibi calisr

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true

        System.out.println(sb1.equals(str)); // false

    }
}
