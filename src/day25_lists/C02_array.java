package day25_lists;

import java.util.Arrays;

public class C02_array {
    public static void main(String[] args) {

        // verilen bir array'den istenen elementi silip kalanlari
        // yarin bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElemaniSil(arr, istenmeyenEleman);
    }

    public static void istenmeyenElemaniSil(int[] arr, int istenmeyenEleman) {

        // 1-istenmeyen eleman sayisini bulalim
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == istenmeyenEleman){
                sayac++;
            }

        }
        // 2-yeni array olusturalim

        int arrYeni[]=new int[arr.length-sayac];

        // 3- eski array`den uygun elemanlari yeniye tasi

        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }
        }

        // 4- yeni array'i yazdiralim

        System.out.println(Arrays.toString(arrYeni));   //   [4, 2, 5, 7, 8, 5, 2, 4]
    }
}
