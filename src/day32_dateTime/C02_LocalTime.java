package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);  // 21:09:49.120741400

        // bir islemin ne kadar surede bittiginni bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        System.out.println(tm);
        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tmLoopSonrasi);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem "+ (nano2-nano1) + " nano saniyede bitti"); // islem 7996300.0nano saniyede bitti


        // ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000)); // bin dk sonra saat : 13:59:48.755272400

        // istersek zone id kullanarak istedigimiz ülkenin saati icin de obje olusturabiliriz


    }
}
