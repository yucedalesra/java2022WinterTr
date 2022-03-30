package day05_matematikselIslemler;

public class C01_PreIncreamentPostIncreament {

    public static void main(String[] args) {

        int sayi = 10;
        // bu sayiyi sadece 1 artirmak istersek sayi++

        sayi++;
        System.out.println(sayi); //11

        sayi++;
        System.out.println("pre-increamentten once " + sayi); //12
        // eger 11. ve 13. satirda yaptigim iki islemi tek satirda yaparsam
        // Java 2 islemden once hangisini yapacagini bilmek ister
        // once artirir sonra yazdirirsak Java yeni degeri yazdirir
        // ama once yazdirir sonra artirirsak bu durumda eski deger yazdirilir

        System.out.println("pre-icreament satirinda " + ++sayi); // 13 once artir sonra yazdir
        System.out.println("pre-increamentten sonra " + sayi); // 13

        System.out.println("post-increament satirinda " + sayi++); // 13 once yazdir sonra artir
        System.out.println("post-increamentten sonra " + sayi); //14



    }
}
