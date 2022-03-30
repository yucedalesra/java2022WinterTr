package day02_Variables;

public class C02_Variables {

    public static void main(String[] args) {
        // Java calismaya main method`dan baslar
        // sonra yukaridan asagi, soldan saga dogru calisir

        // eger istersek bir variable`i once declare edip sonra deger atayabiliriz

        String okulIsmi;

        // Java deger atamasi yapmadigimiy bir Variable olusturmamiza itiraz etmez
        // ancak deger atamasi yapincaya kadar onu kullanmamiza izin vermez
        // System.out.println(okulIsmi);

        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);


        // println ile print arasindaki fark
        // println yazdirma isleminden sonra alt satira gecer
        // sadece print yazinca alt satira gecmez


        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);

        okulIsmi="Java Koleji";
        System.out.println(okulIsmi);

    }
}
