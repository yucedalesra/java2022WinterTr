package day27_constructor;

public class cons02 {
    public static void main(String[] args) {

        cons01 obj1= new cons01();  // default cons. devrede
        /* cons01 class'inda constructor olusturmazsak
        Java default cons.'u kullandigindan
         ob1'i uretebiliriz

         Ancak biz parametreli ve parameresiz bir cons yazdigimizda
         Java default cons.'u siler

         Dolayisiyla biz herhangi bir cons. olusturdugumuzda
         daha önce baska class'lar veya kulllanicilarin
         olusturmus olabilecegi objeleri kullanabilmeleri icin
         default cons.'in islevini gerceklestirecek
         parametresiz bir cons. olusturmakta fayda var
         */

        cons01 obj2=new cons01("Java");
    }
}
