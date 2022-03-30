package day30_passByValue;

public class C02_staticBlock {
    {
        /*
        Static olmayan blocklar ise obje olusturulurken calisir

        static blocklar sadece 1 kere en basta calisir ama
        static olmayan blocklar her obje olusturulurken yaniden calisir

         */
        System.out.println("static olmayan block calisti");
    }
    static {
        System.out.println("static block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_staticBlock obj1=new C02_staticBlock();
        C02_staticBlock obj2=new C02_staticBlock();
    }
}
