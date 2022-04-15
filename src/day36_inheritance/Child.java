package day36_inheritance;

public class Child extends Parent{

    Child(){
        super();

        System.out.println("Child cons. calisti");
    }

    // tüm classlarda biz gormesek bile
    // Java'nin olusturdugu default cons. vardir

    // Extends keyword kullanan class'lardaki
    // tüm cons.'larin ilk satirinda
    // biz gormesek bile super()
    // cons call vardir
    // yani parent class'in parametresiz constroctur call

    public static void main(String[] args) {

        Child child = new Child();
    }


}
