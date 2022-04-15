package day36_inheritance;

public class UstaBasi extends Isci{

    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

    public static void main(String[] args) {

        UstaBasi ustb1= new UstaBasi();
        ustb1.saatUcreti=15;
        ustb1.isim="Emine";
        ustb1.soyIsim="Yuc";
        ustb1.statu="Isci";
        ustb1.isciStatu="Ustabasi";
        ustb1.maas= ustb1.maasHesapla();
        System.out.println(ustb1);

    }
}
