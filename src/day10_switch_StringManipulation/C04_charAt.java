package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {
        //String'de herhangi bir karakteri almka istedigimizde
        // o harfin index'ini kullanarak
        // str.charAt(istenenindex) yazabiliriz

        String str= "Java Cok Guzel";


        // j'yi yazdiralim
        System.out.println(str.charAt(0)); // ilk sirada olursa 0 yazilir


        // Eger G'yi yazdirmak istiyorsak
        System.out.println(str.charAt(9)); // 9.sirada


        //Va yazdiralim
        System.out.println(""+str.charAt(2) + str.charAt(3)); //va


        //cOK sekline yazdiralim
        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5) +
                                    ""+str.toUpperCase(Locale.ROOT).charAt(6)+
                                    str.toUpperCase(Locale.ROOT).charAt(7)); //cOK

        //son karakteri yazdir
        // String'de 14 harf var, son harfin index'i 14-1'dir
        System.out.println(str.charAt(14-1)); // uzunluk-1

        // eger uzunlugu index olarak girersek
        //System.out.println(str.charAt(14)); // HATA VERIR


    }
}
