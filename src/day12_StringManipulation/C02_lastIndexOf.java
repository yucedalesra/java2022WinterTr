package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir kelime isteyin,
        //  kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle= "Java ögren, yeni program ile yeni bir sayfa ac";
        String kelime= "esra";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index
        int sonKullanim= cumle.lastIndexOf(kelime);

        if (ilkKullanim==(-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamistir");
        } else if (ilkKullanim==sonKullanim){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmistir");
        }else {
            System.out.println("Girilen kelime cumlede birden cok kullanilmistir");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p", 4));  // 4 dahil


    }
}
