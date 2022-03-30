package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        // 1-48 of 104 results for "Nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise süper
        // az ise "az sonuc bulundu"

        String str = "1-48 of 104 results for \"Nutella\""; // ters slashlar cift tirnak icinde cift tirnak olursa

        int ilkSpace = str.indexOf(" ");     //4
        System.out.println(ilkSpace);
        int ikinciSpace = str.indexOf(" ", ilkSpace+1);   //7
        System.out.println(ikinciSpace);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace+1);   //11
        System.out.println(ucuncuSpace);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace);    //104
        System.out.println(aramaSonucSayisiStr);

        int aramaSonucSayisiInt = Integer.valueOf(aramaSonucSayisiStr);    //104 int
        System.out.println(aramaSonucSayisiInt);

        if (aramaSonucSayisiInt>100){
            System.out.println("Süper");
        }else {
            System.out.println("Az sonuc bulundu");
        }



    }
}
