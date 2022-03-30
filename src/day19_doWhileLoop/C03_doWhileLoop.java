package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip
        // while look ile 5'ten kucuk sayilari yazdiralim

        int input=3;
        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);
            sayi++;
        }




        // ayni soruyu do while loop ile yapalim

        sayi=1;

        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);

    }
}
