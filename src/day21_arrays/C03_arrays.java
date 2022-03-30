package day21_arrays;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {

        int arr[]; // deger atamasi yapmadik ama Java kabul etti ancak kullanmamiza izin vermez

        arr= new int[6];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

        System.out.println(arr.length); // 6
                                        // String'deki lengt(), bunda parantez yok

        // arraydeki her bir elemani index degerii ladar arttiralim

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += i;
        }

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]

        // Son index'teki elementi yazdiralim
        System.out.println(arr.length-1); // 5

    }
}
