package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        // parametre olarak bir in
        // ve istedigimiz kadar string alan
        // en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir method olusturun

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Alp";

        carpim(sayi,str1,str2);

        // bir method'da varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip
        // varargs'i en sona yazmaliyiz
        // bu sebeple bir method#da birden fazla varargs OLAMAZ
    }

    public static void carpim(int sayi, String... str) {
        String enUzunKelime="";

        for (String each : str

             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
            System.out.println("istenen deger: " + sayi + enUzunKelime.length());

        }
    }
}
