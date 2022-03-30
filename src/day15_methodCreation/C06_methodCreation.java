package day15_methodCreation;

public class C06_methodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variable'in degerlerini toplayan bir method olusturalim
        // 1.adim : Method adini yazalim
        // 2.adim : Method'a gondermem gereken arguman var mi?

        ikiSayiTopla(a,b);



    }
        // bir method'u olusturmak calismasi icin yeterli degildir
        // method ancak cagirilirsa calisir
          // ayni class veya farkli class'ta olmasinin hicbir önemi yoktur
        // Java main method'da yukaridan asagiya dogru calisir
         // ve geldigi satiri calistirir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen iki sayinin toplami : " + (a+b));
    }
}
