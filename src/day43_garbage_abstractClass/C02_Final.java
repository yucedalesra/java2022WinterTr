package day43_garbage_abstractClass;

public abstract class C02_Final extends C01_Final {

    public abstract void abstractMethod();

    public static void main(String[] args) {

        System.out.printf(C01_Final.okulIsmi);

      //   C01_Final.okulIsmi="Esra Koleji";
    }



        /*
        Override Parent class'da ki methodu child class'a uyarlamak demekti
        yani islevini degistirmek istiyoruz
        ancak Parent claa'da ki method final olarak tanimlandigindan
        Java method'un uyarlanmasina izin vermiyor

        public static void method1(){
        System.out.println("Parent Class Final Method1");
        }
         */

}
