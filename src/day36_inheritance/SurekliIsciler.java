package day36_inheritance;

public class SurekliIsciler extends Isci{
    @Override
    public String toString() {
        return "SurekliIsciler{" +
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

        SurekliIsciler surIc1=new SurekliIsciler();
        surIc1.personelNo=5001;
        surIc1.isim="Alp";
        surIc1.soyIsim="Yuc";
        surIc1.statu="Isci";
        surIc1.saatUcreti=11;
        surIc1.maas= surIc1.maasHesapla();

        System.out.println(surIc1);

    }

}
