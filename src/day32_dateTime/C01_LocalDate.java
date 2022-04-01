package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh= LocalDate.now(); // objenin olusturuldugu tarihi trh'ye aktarir
        LocalDate baskatrh = LocalDate.of(1995,11,3);
        // istedigimiz yil ay ve gün degerlerine gore bir obje olustururuz

        System.out.println(trh); // 2022-03-31

        // get'li method'larla tarih ile ilgili detay alabiliriz
        System.out.println(trh.getDayOfMonth()); // 31
        System.out.println(trh.getDayOfWeek()); // THURSDAY
        System.out.println(trh.getMonthValue()); // 3 (. ay)
        System.out.println(trh.getYear()); // 2022


        // bir tarihten istedigimiz kadar ileri ya da geri gidebiliriz

        System.out.println(trh.minusWeeks(20)); // 2021-11-11

        // Tarih dile gore degismez

        // is ile baslayan method'lar boolean sonuc verir
        System.out.println(LocalDate.now().isLeapYear()); // false

        // istedigimiz ulkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01
        System.out.println(trh.isAfter(baskatrh));  // true


    }
}
