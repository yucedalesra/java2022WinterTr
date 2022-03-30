package day05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        short sayi1 = 20;
        Short sayi2 = 30;
        sayi1=sayi2;
        System.out.println(sayi1); //30, sayi 2 deger sayi1 variable. sayi2'yi variable yani sayi1'e atar
        //Wrapper Class ile ayni isimdeki primitive data türü arasinda gecis olabilir


        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.BYTES);


    }
}
