package day06_ConcatenationOperators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8); // false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9 && 5+2!=8; //true

        System.out.println(sonuc1);


        boolean sonuc2 = 5>4 && 7>9 && 6+3 ==9 && 5+2!=8; //false

        System.out.println(sonuc2);

        boolean sonuc3 = 5>4 & 7>9 & 6+3 ==9 & 5+2!=8; //false

        System.out.println(sonuc3);


        // && ile & arasindaki fark



        int sayi3 = 15;

        //sayi 3'ün 10 ile 20 araliginda oldugunu true diyerek dondurelim
        // Java 3'lü karsilastirma kabul etmez
        // 2'li karsilastirmalar yapip mantiksal operatorler ile birlestirmeliyiz


        System.out.println(10<sayi3    &&     sayi3<20); // true

        int sayi4 =5 ;

        //sayi 2'nin 10 ile 15 arasinda olmadigini true diyerek dondurelim

        System.out.println(sayi4<10   ||  sayi4>20); //true

    }
}
