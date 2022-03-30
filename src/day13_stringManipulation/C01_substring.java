package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5)); //ile IT cok guzel
        // yukaridaki String'i kullanarak Mehmet hoca ile IT cok guzel yazalim

        System.out.println(str.replace("Java", "Mehmet hoca")); //Mehmet hoca ile IT cok guzel
        System.out.println("Mehmet hoca " + str.substring(5));  //Mehmet hoca ile IT cok guzel

        System.out.println(str.substring(9)); // yazilan index inclusive


        // Eger bir index'ten sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekiyor str.sunstring(baslangicIndexi, bitisIndexi)
        // baslangic index'i inclusive'dir
        // bitis index'i exclusive'dir

        System.out.println(str.substring(0,5)); //Java
        System.out.println(str.substring(0,1)); //J

       // str.charAt(4); <<<=== charAt methodu

        // 6. harfi String olarak bulun
        String harf =str.substring(5,6); // i // 5,6 yazinca i harfi cikiyor 5 DAHIL, 6 HARIC
        System.out.println(harf);

        System.out.println(str.substring(7,7)); // 7 dahil, 7 haric "" ===>>> hiclik
        //System.out.println(str.substring(5,2)); // hata verir
        // bitis indexì baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1)); // son harfi verir

        System.out.println(str.substring(str.length()-5)); //son 5 harfi verir

        System.out.println(str.substring(str.length())); // son harften sonraki kismi yani hiclik verir



    }
}
