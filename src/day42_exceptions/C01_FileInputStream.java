package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {

    public static void main(String[] args) {

        String dosyaYolu="day41_exceptions/dosya.txt";

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
            int k=0;
            while ((k= fis.read()) != -1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Ecxeption'lar icinde Parent-Child iliskisi mevcuttur
        eger bir kod icin birden fazla exception olusma ihtimali varsa
        oncelikle olasi exception'lar parent-child ilskisi tasiyor mu bakmamiz gerekir
        eger parent-child iliskisi yoksa, istedigimiz sirada catch cümleleri olusturabiliriz


        Eger parent-child iliskisi varsa sadece
        parent exc. yazabilir veya
        ikisini de yazmak istersek
        child'i once parent'i sonra yazmaliyiz
         */

         /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer
        biz bu gune kadar tamamina CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception kavrami da hayatimiza girdi
         */


    }

    }
