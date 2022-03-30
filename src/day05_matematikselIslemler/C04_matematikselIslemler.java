package day05_matematikselIslemler;

public class C04_matematikselIslemler {
    public static void main(String[] args) {

        //primitive data türü ile non-primitive arasindaki farklar nelerdir?


        String str= "Java";
        int sayi=10;

        System.out.println(str.toUpperCase()); //JAVA
        System.out.println(str);

        //non-primitive data türleri data depolamak yaninda bircok faydali method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        //primitive data türleri sadece degerleri saklarlar (container)


        //primitive data turleri icin de bazi method'lar gerekli oldugunda
        // JAVA ara bir cozum uretmistir
        // JAVA her bir primitive data türünü, no-prm olarak kullanabilmek icin
        // ozel class'lar olusturmus ve bunlara Wrapper Class adini vermistir


        double sayi2=20.5;

        // sayi2 primitive oldugundan sayi2 dedigimizde hicbir method gelmez

        Double sayi3 = 15.2;

        //sayi3 Wrapper Class olan Double Class'ini kullandigindan
        // sayi3. dedigimizde bircok method gelir
    }
}
