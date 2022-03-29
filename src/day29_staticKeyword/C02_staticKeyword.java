package day29_staticKeyword;

public class C02_staticKeyword {
    public static void main(String[] args) {

        // Baska class'taki static class üyelerine
        // ulasabilmek icin sadece classIsmi.staticUyeIsmi
        // yazmamiz yeteridir

        System.out.println(C01_static.okulTelefonu); // 31515343

        // Okul telefonu kalici olarak degisir

        C01_static.okulTelefonu="16451231";
        System.out.println(C01_static.okulTelefonu); // 16451231

        // baska class'taki static olmayan class uyelerine
        // ancak o class'tan obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece obje icin gecerli olur

        C01_static obj1= new C01_static();
        C01_static obj2= new C01_static();

        System.out.println(obj2.okulIsmi); // Yildiz Koleji
        obj2.okulIsmi="Sabir Koleji";
        System.out.println(obj2.okulIsmi); // Sabir Koleji
        // sadece obj2 icin durum degisir obj1 degismez
        System.out.println(obj1.okulIsmi); // Yildiz Koleji
    }
}
