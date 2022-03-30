package AdvancedJavaPractice_HalukHoca;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        /*
        Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code creat ediniz
        input: Learning Java is easy
        outout : maximumCounts occurung character is : a
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" agam bir metin gir : "); // hayat java ile cok kolay
            String arr[]=scan.nextLine().split(""); // Kullanicidan gelen metin "" 'e gore parcalanarak her bir parca array'in
        System.out.println(Arrays.toString(arr));
        String enCokTekrarEden="";
        int maxSayac=0;
        int sayac=0;
        for (int i = 0; i < arr.length; i++) { // karsilastirilan karater kontrolu --> h
            for (int j = i+1; j <arr.length ; j++) { // karsilastiran karakter kontrolu --> a,y,a,t....

                if (arr[i].equalsIgnoreCase(arr[j])){ // esit karakterlerin kontrolu yapilip true durumunda
                    sayac++;                          // sayac artirilara esit karakterler saydirilir

                }

            }
            if (sayac>maxSayac){
                maxSayac=sayac;
                enCokTekrarEden=arr[i];
            }else if (sayac==maxSayac){
                enCokTekrarEden+=", "+arr[i];
            }

        }
    }
}
