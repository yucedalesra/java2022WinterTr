package day38_inheritance_overriding;

public class Isci {
    public String statu="Isci";
    public String ikramiye=" isciler yilda bir ikramiye alir";
    public String haklar="Isciler Kidem tazminati alirlar";
    public String izin="tüm personel yilda 4 hafta haizin kullanabilir";

    public void mesai(){
        System.out.println("Tum isciler haftalik 40 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Isci 30 gün*8 saat * 11 Euro = " + (30*8*11) + "Euro maas alir");
    }
}
