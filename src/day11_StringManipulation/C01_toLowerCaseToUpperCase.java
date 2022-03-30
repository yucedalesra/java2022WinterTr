package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCaseToUpperCase {
    public static void main(String[] args) {

        String str= "Java Guzeldir";

        // Biz String methodlarini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk harfini kücük olarak yazdiralim


        // str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
        // dolayisiyla String'de yapmak istedigimiz tüm degisiklikleri
        // önce yapip sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); //JAVA GUZELDİR



    }
}
