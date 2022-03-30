package day09_ternarySwitch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=20;
        //verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir Ternary yazin

       String sonuc =sayi>100 ?"sayi 3 basamakli veya daha büyük" : "sayi negatif veya 3 basamaktan kücük";

       //Ternary bize sonuc dondurdugu icin
        //ya bu sonucu direkt yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);


    }
}
