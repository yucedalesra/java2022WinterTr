package day30_passByValue;

public class C04_PassByValue {
    // eger bir method'da yapilan degisikligin kalici olmasini istiyorsak
    // 2 yöntem kullanabiliriz
    // 1- Variable'yi class level'de static olarak olusturabilirim

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
    }
    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : " + etiketFiyati);

    }

}
