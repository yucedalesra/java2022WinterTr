package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_set {

    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();

        isimler.add("Alperen");
        isimler.add("Misto");
        isimler.add("Aydos");
        isimler.add("Esra");
        System.out.println(isimler); // [Alperen, Misto, Aydos, Esra]

        isimler.set(0, "Alp");  // Alperen gitti, yerine Alp geldi
        System.out.println(isimler);  // [Alp, Misto, Aydos, Esra]

        // daha onceden listede var olanlari da arsiv gibi tutmak istersek

        List<String> logListesi= new ArrayList<>();

        logListesi.add(isimler.set(2, "Cosmos"));
        System.out.println(isimler); // [Alp, Misto, Cosmos, Esra]
        System.out.println(logListesi); // [Aydos]





    }
}
