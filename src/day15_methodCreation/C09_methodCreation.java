package day15_methodCreation;

public class C09_methodCreation {
    public static void main(String[] args) {

        String isim = "yasemin yalcin";
        String soyisim= "sari";
        String kKNo="1234567890128795";


        // eger bir method'da bir islem yapmasini
        // ve yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data türünde olmalidir

        String gizlenmisIsimSoyisim=isimSoyisimGizle(isim, soyisim);
         // bana isim ve soyisimin gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo = krediKartiGizle(kKNo);

        System.out.println(gizlenmisKKNo);

        krediKartiGizle(kKNo);

    }

    public static String krediKartiGizle(String kKNo) {
        String yeniKKNo= "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }


    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        return yeniIsim+ " "+yeniSoyisim;

        // method olusturmada 3.adim
        // method calisinca sadece bir sey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar vermektir
        // bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return type'i void degil String sectik
        // ve method'un sonuna RETURN edilecek datayi yazdik


    }
}
