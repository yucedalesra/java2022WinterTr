package day26_forEachLoop_Constructor;

public class Araba {

    /* Java'da her class olusturdugumuzda
    java o class'dan ileride objeler uretmek gerekecegini bilir
    ve biz ozellikle belirtmesek de Java
    her olusturdugu class'a bir constructor koyar

    Java'nin class olustururken class'a koydugu constructor'a
    DEFAULT CONSTRUCTOR denir ve bu cons. gorunmez

    Eger biz gorunur bir constructor'umuz olsun istersek
    default constructor ile ayni gorevi yapan bir cons. olusturabiliriz
    vya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
    farkli ozelliklerde cons.lar da olusturabiliriz

    cons.'lari birbirinden farklilastiran tek ayricalik
    kullanilan parametre sayisi ve parametre data turudur
     */

    public Araba(){
        System.out.println("Parametresiz constructor calisti");
    }
    /*
    bir kod blogunun method veya cons. olmasindan emin olmak istiyorsaniz
    iki seye dikkat etmelisiniz
        1 - Cons.'larin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
        2 - Cons.'larin return type'i olmaz

        ozetle : cons.'larin adi class adi ile ayni olmali ve
                 retur6n type'i olmamali
     */
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");
    }
}
