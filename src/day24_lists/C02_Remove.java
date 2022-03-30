package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Alperen");
        isimler.add("Misto");
        isimler.add("Aydos");
        isimler.add("Esra");
        System.out.println(isimler); // [Alperen, Misto, Aydos, Esra]

        // eger remove (istenenObject) method'u istenen elementi kaldirip
        // bize true ya da false doner
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // methodu boolean bir variable'ye atayabilirsiniz


        boolean sonuc= isimler.remove("Esra"); // true

        // sonucu kullaniciya yazdirmak isterseniz if else ile istediginz degerlendirmeyi yazabilirsiniz

        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigi icin silinemedi");
        }

        System.out.println(isimler); // [Alperen, Misto, Aydos]

        isimler.remove("Alperen");
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigi icin silinemedi");
        }
        System.out.println(isimler); //[Misto, Aydos]

        // remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove olan elementi döndürür

        System.out.println(isimler.remove(1));  // Aydos

        // yazdirsak da yazdirmasak da liste degisti 1.indek'teki element silindi

    }
}
