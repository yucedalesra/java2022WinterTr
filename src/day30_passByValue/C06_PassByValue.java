package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {
        /*
        non primitive data türlerinde objenin kendisi degil de
        icindeki elemetler degisirse
        Java objenin referansi ve objenin kendisi degismedigi icin
         */

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
    }

    public static void arrDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }


}
