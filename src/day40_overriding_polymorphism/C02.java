package day40_overriding_polymorphism;

public class C02 extends C01{

    private void method4(){
        System.out.println("child method4");
    }
    //@Override Parent class'daki privat method 4'e
    //Child class'dan ulasmamiz mumkun olmadigindan
    // Java bu iki methodu
    // TAMAMEN FARKLI IKI METHOD olarak kabul eder
    // kullanmak istersek java kabul etmez


    /*
     @Override notasyonu overridden method ile overriding methodu
     birbirine baglar.
     Farkinda olunmadan overriden method silinirse veya
     signature degistirilirse
     bu iliski bozulacagi iciin Java CTE verir


     Notasyon kullanilmazsa Java bunlarin iliskisini bilir ama
     overridden method silinirse sesini cikarmaz

     */
    @Override
    public void method2() {
        super.method2();
    }

    public static void main(String[] args) {

        C02 obj1 =new C02();

        obj1.method1(); // parent
        obj1.method2(); // child

        C01 obj2 = new C02();
        obj2.method1(); // parent
        obj2.method2(); // child

        C01 obj3=new C01();
        obj3.method1(); // Parent
        obj3.method2(); //Parent
    }
}
