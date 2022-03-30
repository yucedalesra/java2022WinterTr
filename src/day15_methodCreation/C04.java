package day15_methodCreation;

public class C04 {
    // Main method olmadan da bir class olusturulabilir
    // ancak bu class direkt calismaz
    // sadece depo görevi görür
    // baska class'lardan kullanilabilecek method veya variable'leri barindirir

    // 1- method olusturmak icin method'un adini yazariz
    // 2- method'a giderken götürmem gereken variable varsa, bunu method'a eklemeliyim


    public static void besHarfiTersineCevir(String kelime) {
        String  tersKelime= kelime.substring(4)+
                kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayisi : 5" );
        System.out.println("Kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("Kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String   tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println("Kelimenin tersten yazilisi : " + tersKelime);
    }
}
