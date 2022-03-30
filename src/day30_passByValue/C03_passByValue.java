package day30_passByValue;

public class C03_passByValue {
    public static void main(String[] args) {

        /*
        Java pass by value bir programlama dilidir
        yani; bir primitive variable'yi argumet olarak bir methoda yollarsaniz
        Java o variable'yi degil, degerini(value) method'a yollar (pass)
         */
        int etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method'da etiket fiyati : " + etiketFiyati);

    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indirimli fiyatimiz : " + etiketFiyati);
    }
}
