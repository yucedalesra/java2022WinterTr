package day38_inheritance_overriding;

public class Personel {

    String statu="Personel";
    String haklar="Tüm personel esit haklara sahiptir";

    public void mesai(){
        System.out.println("Tum personel 5 gun, gunde 8 saat calisir");
    }

    public void maasHesapla(){
        System.out.println("Tum personel 30 gün*8 saat * 10 Euro = " + (30*8*10) + "Euro maas alir");

    }

    public static void main(String[] args) {

    }
}
