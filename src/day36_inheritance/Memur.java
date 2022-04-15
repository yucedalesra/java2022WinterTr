package day36_inheritance;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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

    Memur memur1=new Memur();
        //memur1 objesi memur class'inin objesi olmasina ragmen
        // inherit ettigi muhasebe ve onunda parent'i olan
        // Personel class'larindaki tum data'lari alabilir

        // Personel class'indan
        memur1.personelNo=1001;
        memur1.isim="Esra";
        memur1.soyIsim="Gül";
        memur1.adres="Istanbul";
        memur1.telefon="3154621561";

        // Muhasebe classindan
        memur1.saatUcreti=10;
        memur1.statu="memur";
        memur1.maas= memur1.maasHesapla();
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.isim="Alp";

        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);




    }
}
