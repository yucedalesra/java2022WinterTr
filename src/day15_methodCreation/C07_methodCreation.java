package day15_methodCreation;

public class C07_methodCreation {

    public static void main(String[] args) {
        // string'i yazdiran method olusturalim
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazn bir method olustur

        hosgeldinYazdir();

    }
    public static void kapanmaMesaji() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }
    public static void hosgeldinYazdir() {
        System.out.println("Hos geldiniz");
        stringYazdir("Boyle de olur");
    }
    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMesaji();
    }

}


