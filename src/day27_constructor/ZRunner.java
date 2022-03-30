package day27_constructor;

public class ZRunner {
    public static void main(String[] args) {

        Z obj1 = new Z("Esra","Nur", 82, true);
        System.out.println(obj1); // Isim : Esra, soyisim : Nur, numara :82


        Z obj2 = new Z("Esra", "Nr", 55);
        System.out.println(obj2); // Isim : Esra, soyisim : Nr, numara :55


        Z obj3=new Z("Ali", "Er", 50 );
        System.out.println(obj3); // Isim : Ali, soyisim : Er, numara :55

    }

}
