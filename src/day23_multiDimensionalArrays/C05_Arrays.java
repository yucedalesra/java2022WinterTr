package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]= {3,5,7};

        // arr[3]=8;  // array'de olmayan bir index'e atama yapamayiz

       // arr={1,3,5}; // var olan bir array'e ayni boyutta bileolsa direkt yani degerler iceren bir array atayamayiz

        arr=new int[4]; // [0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));

        int arrYeni[] = new int[5];

        arr=arrYeni; //[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni; // [2, 0, 0, 5, 0]
        System.out.println(Arrays.toString(arr));

        // Bir array'e icinde hazir elemetlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3} seklinde yazarak dgil
        // new int[3] diyerek olustrup sonra deger atayarak tamamladigimiz bir array'i
        //assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};

        arr=arrEnYeni; // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arr));



    }
}
