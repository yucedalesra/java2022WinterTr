package PraktischMachen;

import java.util.Arrays;
import java.util.List;

public class C06_arraydenListOlusturma {
    public static void main(String[] args) {

        // Verilen bir Array'i listeye cevirin

        String arr[]={"A", "B", "C"};
        List<String> arraydenList= Arrays.asList(arr);

        // array'den list'e cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        //dolayisiyla yeni list ile add(), remove(), clear() gibi methodlari calistirmak
        // istedigimizde Exception olusur

       //  arraydenList.add("J");   // UnsupportedOperationException

        System.out.println("20. satirda list : " + arraydenList); // [A, B, C]

        arr[1]= "F";

        System.out.println("24.saytirda Array : " + Arrays.toString(arr)); // [A, F, C]
        System.out.println("25.satirda list : " + arraydenList); // [A, F, C]

        arraydenList.set(0,"Y");




    }
}
