package day09_ternarySwitch;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {

        //Ternary ile yapilan tum islemler if else if ile de yapilabilir
        // if else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        // Ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca götüren basit islemler olabilir

        //Kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi girin");
        int sayi = scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("Tek sayi");
        }
        System.out.println(sayi%2==0 ? "sayi cift" : "Sayi tek");

    }
}
