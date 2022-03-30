package day22_arrays;

import java.util.Arrays;

public class C03_buyuktenKucugeSiralama {
    public static void main(String[] args) {

        //verilen bir Array'i buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arr);

        //en büyük sayiyi yazdir
        System.out.println(arr[0]);  //0
    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];
        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.toString(tersArr));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {

            tersArr[arr.length-1-i] = arr[i];
        }
        System.out.println(Arrays.toString(tersArr)); // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]

    }


}
