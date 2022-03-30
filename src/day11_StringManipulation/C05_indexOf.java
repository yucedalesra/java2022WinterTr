package day11_StringManipulation;

import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {

        String str1= "Java bir baska güzel valla cok güzel";

        // Istersek char olarak biir harfin indexini bize döndürür
        System.out.println(str1.indexOf('J')); // 0

        // Istersek bir harf ya da metin olarak verdigimiz String'in indexini döndürür

        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1); //35
        System.out.println(str1.indexOf("aska")); //10

        //ayni harften birden fazla varsa?
        System.out.println(str1.indexOf("b")); // 5, buldugu ilk dogru eslesmenin index'ini verir


        System.out.println(str1.indexOf('b', 5)); //5
        // bu method'da Java aramaya from index olarak yazdigimiz index'ten baslar
        //(inclusive)

        // Verilen Stringdeki 2. a harfinin index'ini bulalim

        int ilkindex= str1.indexOf('a'); //1
        System.out.println(str1.indexOf('a' , ilkindex+1)); //3


        // Verilen Stringdeki 2. b harfinin index'ini bulalim

        int ilkbindex= str1.indexOf('b'); //5
        System.out.println(str1.indexOf( "b" , ilkbindex+1)); //9

        // 20.index'ten sonra güzel aratalim
        System.out.println(str1.indexOf("güzel", 20)); //31


        // String'de olmayan bir harf aratsak?
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type`i index


        // YOK DEMENIN SAYISAL KARSILIGI OLARAK JAVA -1 DONDURMEYI TERCIH ETMISTIR

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else {
            System.out.println("Mailiniz kabul edildi");

        }
        //OZET: indexOf method'u icerisine yazilan String veya char'in
        // metinde hangi index'de oldugunu bize döndürür
        // eger aradigimiz metin veya char yoksa, olmadiginin delili olarak
        // bize -1 döndürür

    }

}
