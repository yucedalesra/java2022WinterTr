package day43_garbage_abstractClass;

public abstract class C04 {
    /*
    Bir abs. class'da bir abs veya concrete methodlar bulunabilir
    Child class'larin abs. methodlari override etmesi MECBURI iken,
                  concrete methodlarin override edilmesi OPSIYONEL'dir
     */

    public abstract void absMethod();


    public static void concreteStaticMethod(){
        System.out.printf("C04 concrete method");
    }

    public static void main(String[] args) {

        /*
        Abs. class'lar consturoctur'a sahiptir
        ancak abs. class'lardan OBJE OLUSTURULAMAZ


        Abs. class'lar OBJE BARINDIRMAYAN,
        sadece child class'lar icin
        UYULMASI SART OLAN veya OPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir

         */

      //    C04 obj=new C04();
        System.out.println("Bu class Abstract");
        concreteStaticMethod();

    }
}
