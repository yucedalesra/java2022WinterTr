package day18_nestedForLoop;

public class C06_whileLoop {
    public static void main(String[] args) {
        // kullanicidan iki tam sayi alip
        // bu sayilari ve aralarindali tum tamsayilari yazdiran bir kod olusturun


        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <= bitis ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        // ayni soruyu while Loop ile yapalim

        while (baslangic <= bitis){

            System.out.print(baslangic+ " ");
            baslangic++;

        }
        System.out.println("");
        System.out.println(baslangic); //61

    }
}
