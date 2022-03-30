package day28_constructor;

public class staticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        /*
        Static variable'le direkt class'a baglidir
        Claas icerisinde yapilan her turlu degisiklik static variable'lerde kalici olur

        Instance variable'ler ise objeye baglidir
        Iinstance variable'lere obje uzerinden erisilebilir
        ve bir obje uzerinde erisilerek yapilan degisiklik
        intance variable'nin degerini tum objeler icin kalici olarak degistirmez
        sadece o obje icin instance variable degerini kalici olarak degistirir
         */

        System.out.println("sayi1 : " + sayi1); // 0
        // static olmadigi icin main method'dan dirkt kullanamayiz  -->>> System.out.println("sayi2 : " + sayi2);
        staticKeyword obj1= new staticKeyword();
        System.out.println(obj1.sayi2); // 0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi 1 : " + sayi1); // 1
        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1); // 1

        staticKeyword obj2=new staticKeyword();

        System.out.println(obj2.sayi2); // 0
        System.out.println(obj2.sayi1); // 1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 2

        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1);// 2

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2); // 2
        System.out.println(obj1.sayi1); // 3

        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 3


    }
}
