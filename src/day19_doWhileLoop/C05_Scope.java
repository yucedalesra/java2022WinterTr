package day19_doWhileLoop;

public class C05_Scope {

    //   1  -Bir method icerisinde olusturulan variable'lar sadece olusturulduklari
    //  method'da kullanilabilirler, baska methodlarda kullanilamazlar
    //   2 - Tüm methodlarin kullanabilesini istedigimiz variable'leri
    //  Class Level 'de olustururuz
    //  Class level'de olusturdugumuz variable'yi
    // ----static yaparsak tum methodlar kullanabilir
    // ---- static olmazsa (instance) o zaman sadece static olmayan methodlar kullanabilir
    //  3 - Loop icinde olusturulan variable'ler loop icerisinde kullnilabilir
    //  ama loop'un disinda kullanilamaz



    static String kurs = "Java";
    int level = 10;

    public static void main(String[] args) {

        int sayi =10;
        System.out.println(kurs);
        //System.out.println(level); static olmadigi icin kullanilamaz

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
            int loopSayi=20;
        }
       // System.out.println(i); loopun disinda kullanilamaz

    }

    public static void method1(){
        System.out.println(kurs);

    }

    public void method2(){
        System.out.println(level);

    }

}
