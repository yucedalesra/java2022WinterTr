package day06_ConcatenationOperators;

public class C01_concatenation {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";
        System.out.println(a+b);      //HelloWorld
        System.out.println(a+" "+b); // Hello World

        String str1= "Java";
        String str2= "Guzel";
        int sayi1= 5;
        int sayi2= 3;

        // Variable'lerin degerlerini degistirmeden
        // asagidaki ifadeleri bu variableleri kullanarak yazdirin

        // Java5Guzel
        System.out.println(str1+sayi1+str2);

        //2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        // Java22

        System.out.println(str1+(sayi1-sayi2)+ (sayi1-sayi2));

        //53Guzel

        System.out.println(sayi1+sayi2+str2); // 8Guzel
        System.out.println(sayi1+ (sayi2 + str2)); //53Guzel
        System.out.println("" +sayi1+sayi2+str2); //53Guzel

        /*
        Eger tamamen sayilardan olusan bir String varsa ve biz bunu Int'a cevirmek istersek
        Integar.valueOf(str)

        bir sayiyi String'e cevirmek istersem
        ""+sayi
         */







    }
}
