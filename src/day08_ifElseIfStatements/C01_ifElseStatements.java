package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {


        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");
        char karakter = scan.next().charAt(0);

        if (( karakter >= 'A' && karakter <= 'Z'  || karakter >= 'a' && karakter <= 'z')){
            System.out.println("Girdiginiz karakter bir harftir");
        } else {
            System.out.println("Girdiginiz karakter bir harf degildir");}



    }
}
