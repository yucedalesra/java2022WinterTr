package day40_overriding_polymorphism;

public class C04_Exceptions {
    public static void main(String[] args) {

        // String olarak verilen bir sayiyi, integer'a cevirip
        // 2 katini ekranda yazdiralim

        String str="12345a";

        int sayi=Integer.parseInt(str);

        // str icinde sayi olmayan bir karakter olursa
        // NumberFormatException.forInputString verir

        System.out.println("girilen sayinin 2 kati : " + 2*sayi);

        try {
            System.out.println("girdiginiz sayinin 2 kati : " + sayi);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("girdiginiz String sayi olmayan elementler iceriyor ");
        }
    }
}
