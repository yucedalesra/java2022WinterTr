package day02_Variables;

public class C01_Variables {


    public static void main(String[] args) {
        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data türü secmeliyiz
        // örnegin bir sehrin nüfusundan bahsediyorsak
        // variablemizin data türü String, boolean, char veya double olamaz
        // geriye kalan tam sayi türlerinden sehrin nüfusunu icine alabilecek buyuklukte bir data türü seceriz
        // biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz

        System.out.println("Hello World yazdiran Javayi halleder");

        int level=1;

        System.out.println(level);


        boolean ogrenciMi= true;

        System.out.println(ogrenciMi);

        boolean yagisVarMi= false;


        char ozelSembol= '§';
        char sayi= '2';
        char harf= 'F';

        System.out.println(harf);


    }
}
