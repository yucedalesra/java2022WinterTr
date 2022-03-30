package day21_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse"};
        // Array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1 [0]); // Ali

        arr1[1]="Esila";        // Veli yerine Esila yazdirir
        System.out.println(arr1 [1]);

        // Array'in icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]= new int[4];
        System.out.println(arr2[1]); //0
        System.out.println(arr2[3]); //0
        // System.out.println(arr2[5]); // out of bounds olur

        // Array'in tamamini yazdirmak istersek

        System.out.println(arr2); //[I@e9e54c2
                                    // Array'ler non-primitive olduklarindan direkt yazdirmak istersek
                                    // Java referans bilgisini yazdirir

        for (int i = 0; i <4 ; i++) {
            System.out.print(arr2[i] + " "); // 0 0 0 0
        }
        System.out.println("");
        // array'i yazdirmak icin Arrays class'indan toString() kullanilir

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); //[0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1)); // [Ali, Esila, Ayse]
    }
}
