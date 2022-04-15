package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        // kac tane String verilirse verilsin
        // iclerinde en uzun olani yazdiran bir method olusturun

        String str1="Ali";
        String str2="Veli";
        String  str3="Oguzhan";


        // Yazilan argument sayisi sabitse bir method olusturabiliriz
        // Ancak argüment sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir

        enUzunKelime(str1,str2,str3 );

    }

    public static void enUzunKelime(String...str) {

        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("en uzun kelime :" + enUzunStr);
    }

}
