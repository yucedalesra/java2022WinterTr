package day04_dataCasting_Increment;

public class C06_IncrementDecreament {
    public static void main(String[] args) {


        int numA = 2;
        numA = numA+3; // veya numA +=3 olarak yazilabilir
        System.out.println(numA);

        int sayi = 20;

        System.out.println(sayi+10); // 30
        // bu satirda sayiyi 10 artirmadim
        // sayinin 10 fazlasini yazdirdim


        System.out.println(sayi); //20

        //eger atama yapmazsak sayida yaptigimiz artirma ya da azaltma kalici olmaz

        sayi = sayi+10;
        System.out.println(sayi);

        System.out.println(sayi = sayi+=10); //40
        System.out.println(sayi); //40

        System.out.println(sayi+=10); //50
        System.out.println(sayi); //50

        // bir variable'in degerini kalici olarak artirmak veya azaltmak isterseniz ASSIGMENT sart.

        System.out.println("33.satir : " +  sayi++); //50
        System.out.println("34.satir :" + sayi);     //51

        System.out.println("36.satir : " +  ++ sayi); //52
        System.out.println("37.satir : " + sayi);     //52






    }
}
