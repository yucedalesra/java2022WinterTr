package day09_ternarySwitch;

public class C05_Ternary {
    public static void main(String[] args) {


        // Bazen ternary'deki iki sonucun data türleri farkli olabilir

        // verilen sayi 100'den büyükse sayi'nin karesini alip yazdiran
        // 100'den kücükse sayi "sayi 100'den büyük olmali" yazdiran
        //bir ternary olusturalim

        int sayi= 50;

        //ternary bize sonuc getirdiginden ya sonucu direkt yazdirmaliyiz
        // veya bir degiskene atamaliyiz
        // eger sonuclar farkli data türlerinde ise
        // atama yapacagimiz variable'in data turu tek olacagindan
        // atama yapamayiz
        // SADECE direkt yazdirabiliriz

        // sayi>100 ? sayi*sayi : "sayi 100'den buyuk olmali";

        System.out.println(sayi>100 ? sayi*sayi : "sayi 100'den buyuk olmali");


    }

}
