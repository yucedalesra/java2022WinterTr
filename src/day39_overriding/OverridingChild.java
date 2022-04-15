package day39_overriding;

public class OverridingChild extends OverridingParent{

    public static void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        /*
        Bir obje olusturulurken data turu ve cons. ayni class'tan secilmisse
        Java direkt o class'a gider
        hem variable hem de method icin
        o class'ta varsa kullanir
        yoksa o class'in paret'larina bakar

         */
        OverridingChild obj1=new OverridingChild();
        obj1.method1(); // child class method1
        obj1.method2(); // parent class method2

        OverridingParent obj3= new OverridingParent();
        obj3.method2(); // Parent class method2
        obj3.method1(); // Parent class method1
        /*
        Eger Data turu Parent, Constructor Child class'dan secildiyse
        variable'larda yukaridaki sekilde calisma devam eder
        Ancak
        Method'lar icin Data turunun oldugu class'daki method
        Child class tarafindan OVERRIDE edilmis mi diye kontrol etmemiz gerekir
        Eger child class'larda bumethod override edilmisse
        override eden method calisir
         */
        OverridingParent obj2= new OverridingChild();
        obj2.method2(); // Parent class method2
        obj2.method1(); // Child class method1
    }
}
