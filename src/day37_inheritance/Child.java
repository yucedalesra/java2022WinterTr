package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {

    // bir class'i child class yaptigimizda
    // Parent class'daki cons.'a ulasmasi gerekir
    // bu durumda parent class'daki cons.'in
    // access modifieri uygun secilmelidir (public,..)



    Child(){
        super();
        System.out.println("child class parametresiz cons.");
    }
    Child(int s){

        // child class'da tüm cons.larin
        // ilk satirina Java'nin yerlestirdigi cons.
        // PARAMETRESIZ dir yani super()

        System.out.println("child class parametreli cons.");
    }

    Child(int sayi1, int sayi2){

        // eger parent class'dan parametresiz cons.'u degil de
        // baska bir cons.'u calistirmak isterseniz
        // bunu child class'daki cons.'un ilk satirina yazmalisiniz
        
        super(sayi1,sayi2);
        System.out.println("iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);
    }
}
