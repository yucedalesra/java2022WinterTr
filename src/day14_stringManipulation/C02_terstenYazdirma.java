package day14_stringManipulation;

import java.util.Locale;

public class C02_terstenYazdirma {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve
        // girilen kelimeyi tersten yazdirin.

        String input= "Mavi";


        String tersStr= input.substring(3).toUpperCase(Locale.ROOT) +  //Ivam
                        input.substring(2,3) +
                        input.substring(1,2) +
                        input.substring(0,1) .toLowerCase(Locale.ROOT);

        System.out.println(tersStr);



    }
}
