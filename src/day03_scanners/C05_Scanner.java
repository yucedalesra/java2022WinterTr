package day03_scanners;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


     //   Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirinca

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yariCap = scan.nextDouble();

        System.out.println("girdiginiz yariCap : " + yariCap);
        System.out.println("cemberin cevresi : " + 2*3.14*yariCap);
        System.out.println("dairenin alani: " + 3.14* yariCap*yariCap);
    }
}
